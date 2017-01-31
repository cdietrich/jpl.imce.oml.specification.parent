#!/bin/bash

set -ev

# Deploy if TRAVIS_TAG is set.
# Error if TRAVIS_SECURE_ENV_VARS is false

[ -z "${TRAVIS_TAG}" ] && exit 0;
[ ! ${TRAVIS_SECURE_ENV_VARS} ] && exit -1;

# Download dependencies and create a mavenized target platform repository for dependency resolution
./gradlew :installTargetPlatform

# Use the mavenized target platform repository to build the actual eclipse projects
./gradlew build 

# Upload the update size
./gradlew build :jpl.imce.oml.specification.repository:bintrayUpload --info
