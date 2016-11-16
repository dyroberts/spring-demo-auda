#!/bin/sh

cd spring-demo

./gradlew build -x test

cd ..

mkdir deploy

cp spring-demo/build/libs/demo-0.0.1-SNAPSHOT.jar deploy/

cp spring-demo/manifest.yml deploy/
