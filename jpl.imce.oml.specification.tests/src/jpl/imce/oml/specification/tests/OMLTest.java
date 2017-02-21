package jpl.imce.oml.specification.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.SaveOptions.Builder;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.junit.Before;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.itemis.xtext.testing.FluentIssueCollection;

public class OMLTest {

	@Inject 
	protected Provider<XtextResourceSet> resourceSetProvider;
    
    @Inject
    private IResourceServiceProvider.Registry serviceProviderRegistry;

    private static Logger LOGGER = Logger.getLogger(OMLTest.class);

    protected String resourceRoot;

    public OMLTest() {
        this("/");
        new StandaloneSetup().setPlatformUri("..");
    }

    public OMLTest(final String resourceRoot) {
        /*
         * Classpath resolution is weird
         *
         * For resources directly in the classpath, you need a starting slash
         * after 'classpath:/': - classpath://bla.txt
         *
         * But if you wan't to point to something in a subfolder, the subfolder
         * must occur directly after 'classpath:/': - classpath://subfolder
         *
         * A trailing slash is optional.
         */
        if (!resourceRoot.contains(":/")) {
            this.resourceRoot = "classpath:/" + resourceRoot;
        } else {
            this.resourceRoot = resourceRoot;
        }
    }
    
    protected FluentIssueCollection issues;
    private Set<Issue> assertedIssues;
    private boolean compareSerializedModelToInputFile;
    private boolean invokeSerializer;
    private boolean formatOnSerialize;
    private boolean failOnParserWarnings;
    private boolean ignoreOsSpecificNewline;
    private EObject rootElement;
    private XtextResourceSet resourceSet;
    
    @Before
    public final void _before() {
        issues = null;
        assertedIssues = new HashSet<Issue>();
        invokeSerializer = true;
        compareSerializedModelToInputFile = true;
        formatOnSerialize = true;
        failOnParserWarnings = true;
        resourceSet = resourceSetProvider.get();
        resourceSet.setClasspathURIContext(this);
    }
    /**
     * Returns the expected type of the root element of the given resource.
     */
    protected Class<? extends EObject> getRootObjectType(final URI uri) {
        return null;
    }
    
    protected FluentIssueCollection testFile(
    		final String fileToTest, 
    		final String... referencedResources) {

        LOGGER.info("testing " + fileToTest + " in test method "
                + this.getClass().getSimpleName() + "."
                + new Throwable().fillInStackTrace().getStackTrace()[1].getMethodName());

        for (final String referencedResource : referencedResources) {
            final URI uri = URI.createURI(resourceRoot + "/" + referencedResource);
            loadModel(resourceSet, uri, getRootObjectType(uri));
        }

        return testFile1(resourceRoot, fileToTest);
    }
    
    protected FluentIssueCollection testFile1(final String resourceRoot, final String fileToTest) {
   		final URI uri = URI.createURI(resourceRoot + "/" + fileToTest);
        return testFile1(uri);
    }
    
    protected FluentIssueCollection testFile1(final URI uriToTest) {
        final Pair<String, FluentIssueCollection> result = loadAndSaveModule(uriToTest);

        String serialized = result.getFirst();

        if (compareSerializedModelToInputFile) {
            String expected = loadFileContents(uriToTest);
            if (ignoreOsSpecificNewline) {
                expected = expected.replaceAll("(\r\n|\r)", "\n");
                serialized = serialized.replaceAll("(\r\n|\r)", "\n");
            }
            // Remove trailing whitespace, see Bug#320074
            // todo: Check if the trim really is still necessary!!
            assertEquals(expected.trim(), serialized.trim());
        }

        return issues = result.getSecond();
    }

    @SuppressWarnings("unchecked")
    protected <T extends EObject> T loadModel(
    		final ResourceSet rs, 
    		final URI uri, 
    		final Class<T> clazz) {
        final Resource resource = rs.createResource(uri);
        try {
            resource.load(null);
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        final StringBuilder errors = new StringBuilder();
        if (!resource.getWarnings().isEmpty()) {
            LOGGER.error("Resource " + uri.toString() + " has warnings:");
            for (final Resource.Diagnostic issue : resource.getWarnings()) {
                LOGGER.error(issue.getLine() + ": " + issue.getMessage());
            }
            if (failOnParserWarnings) {
                errors.append("Resource as warnings:");
                for (final Resource.Diagnostic issue : resource.getWarnings()) {
                    errors.append("\n  - " + issue.getLine() + ": " + issue.getMessage());
                }
                errors.append("/n");
            }
        }

        if (!resource.getErrors().isEmpty()) {
            LOGGER.error("Resource " + uri.toString() + " has errors:");
            for (final Resource.Diagnostic issue : resource.getErrors()) {
                LOGGER.error("    " + issue.getLine() + ": " + issue.getMessage());
            }

            errors.append("Resource as errors:");
            for (final Resource.Diagnostic issue : resource.getErrors()) {
                errors.append("\n  - " + issue.getLine() + ": " + issue.getMessage());
            }
        }

        final String failMessage = errors.toString();
        if (!failMessage.equals("")) {
            fail("\n\n" + failMessage + "\n");
        }

        assertFalse("Resource has no content",
                resource.getContents().isEmpty());
        final EObject o = resource.getContents().get(0);
        // assure that the root element is of the expected type
        if (clazz != null) {
            assertTrue(clazz.isInstance(o));
        }
        EcoreUtil.resolveAll(resource);
        return (T) o;
    }
    
    protected String loadFileContents(final String rootPath, final String filename) {
        final URI uri = URI.createURI(resourceRoot + "/" + filename);
        return loadFileContents(uri);
    }
    
    protected String loadFileContents(final URI uri) {
        	try {
            final InputStream is = resourceSet.getURIConverter().createInputStream(uri);
            final ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int i;
            while ((i = is.read()) >= 0) {
                bos.write(i);
            }
            is.close();
            bos.close();
            return bos.toString();
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    protected Pair<String, FluentIssueCollection> loadAndSaveModule(final String rootPath, final String filename) {
        final URI uri = URI.createURI(resourceRoot + "/" + filename);
        return loadAndSaveModule(uri);
    }
    
    protected Pair<String, FluentIssueCollection> loadAndSaveModule(final URI uri) {
                rootElement = loadModel(resourceSet, uri, getRootObjectType(uri));

        final Resource r = resourceSet.getResource(uri, false);
        final IResourceServiceProvider provider = serviceProviderRegistry.getResourceServiceProvider(r.getURI());
        final List<Issue> result = provider.getResourceValidator().validate(r, CheckMode.ALL, null);

        if (invokeSerializer) {
            final ByteArrayOutputStream bos = new ByteArrayOutputStream();
            try {
                final Builder builder = SaveOptions.newBuilder();
                if (formatOnSerialize) {
                    builder.format();
                }
                final SaveOptions s = builder.getOptions();

                rootElement.eResource().save(bos, s.toOptionsMap());
            } catch (final IOException e) {
                throw new RuntimeException(e);
            }

            return Tuples.create(bos.toString(), new FluentIssueCollection(r, result, new ArrayList<String>()));
        } else {
            return Tuples.create("-not serialized-", new FluentIssueCollection(r, result, new ArrayList<String>()));
        }
    }

}
