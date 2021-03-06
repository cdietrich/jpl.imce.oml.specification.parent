#!/bin/bash

set -ev

# Deploy if TRAVIS_TAG is set.
# Error if TRAVIS_SECURE_ENV_VARS is false

[ -z "${TRAVIS_TAG}" ] && exit 0;
[ ! ${TRAVIS_SECURE_ENV_VARS} ] && exit -1;

./scripts/travis-build.sh

# Upload the update size
./gradlew build :jpl.imce.oml.specification.repository:bintrayUpload --info --stacktrace
