#!/bin/bash --login

export PUBLISHING_USER="$ARTIFACTORY_BEATGRID_CREDS_USR"
export PUBLISHING_PASSWORD="$ARTIFACTORY_BEATGRID_CREDS_PSW"
export PUBLISHING_URL="https://artifactory.beatgrid.net/artifactory/libs-release-local"

./gradlew clean build publish
