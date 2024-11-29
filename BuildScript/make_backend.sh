#!/bin/bash

# turn on bash's job control
#set -m

rm -rf Sample_Java_Template
git clone -b "$GIT_BRANCH" https://"$GIT_USER":"$GIT_PASS"@github.com/newtglobalgit/Sample_Java_Template.git


cd Sample_Java_Template
yum install java-17-openjdk-devel -y

mvn clean install surefire-report:report -Dserver.port=8090

cd target/

tar -cvf javatemplate.tar AppRemediation.war

