#!/bin/sh

mkdir temp

docker run --rm -v "${PWD}:/local" --user $(id -u):$(id -g) openapitools/openapi-generator-cli generate -p hideGenerationTimestamp=true \
    -i "/local/swagger.yaml" \
    -g java-micronaut-server  \
    -o /local