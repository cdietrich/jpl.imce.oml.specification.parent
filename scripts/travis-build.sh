#!/bin/bash

set -ev

# Build if TRAVIS_TAG is unset or empty.
[ -n "${TRAVIS_TAG}" ] && exit 0;

# Get the tag for this commit
t=$(git name-rev --tags --name-only $(git rev-parse HEAD))

# Bypass the build if the tag is anything but 'undefined'.
[ "undefined" != "$t" ] && exit 0;

./gradlew --version

# Download dependencies and create a mavenized target platform repository for dependency resolution
./gradlew :installTargetPlatform

# Update Eclipse project-related metadata
./gradlew :jpl.imce.oml.specification.ecore:cleanEclipse
#./gradlew :jpl.imce.oml.specification.ecore:eclipse

# build the OML metamodel
#./gradlew :jpl.imce.oml.specification.ecore:build

# generate the Scala libraries
#./gradlew :gov.nasa.jpl.imce.oml.specification.scala.generators:generateOMLResolverLibrary

# Use the mavenized target platform repository to build the actual eclipse projects
#./gradlew build 

