#!/bin/sh

rm -rf .original
rm -rf .latest

mkdir .original
mkdir .latest

git show HEAD:swagger.yaml > swagger.yaml.orig

docker run --rm -v "${PWD}:/local" --user $(id -u):$(id -g) openapitools/openapi-generator-cli generate -p hideGenerationTimestamp=true \
    -i "/local/swagger.yaml.orig" \
    -g java-micronaut-server  \
    -o /local/.original

docker run --rm -v "${PWD}:/local" --user $(id -u):$(id -g) openapitools/openapi-generator-cli generate -p hideGenerationTimestamp=true \
    -i "/local/swagger.yaml" \
    -g java-micronaut-server  \
    -o /local/.latest

rm swagger.yaml.orig

# Just a diff: opendiff src .latest/src -ancestor .original/src 
opendiff src .latest/src -ancestor .original/src -merge ./src


