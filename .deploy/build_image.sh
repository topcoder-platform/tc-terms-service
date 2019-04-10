#!/bin/bash
JQ="jq --raw-output --exit-status"

# Define script variables
DEPLOY_DIR="$( cd "$( dirname "$0" )" && pwd )"
WORKSPACE=$PWD

cd $DEPLOY_DIR/docker

echo "Copying deployment files to docker folder"
cp $WORKSPACE/target/terms-microservice*.jar terms-microservice.jar
cp $WORKSPACE/src/main/resources/terms-service.yaml terms-service.yaml

#Copying ECS task template with place holder values 
cp $WORKSPACE/.deploy/ecs_task_template.json ecs_task_template.json

echo "Logging into docker"
echo "############################"
#docker login -e $DOCKER_EMAIL -u $DOCKER_USER -p $DOCKER_PASSWD
#docker login -u $DOCKER_USER -p $DOCKER_PASSWD

echo "Building docker image..."
#eval $(aws ecr get-login  --region $AWS_REGION --no-include-email)
#TAG=$AWS_ACCOUNT_ID.dkr.ecr.$AWS_REGION.amazonaws.com/$AWS_REPOSITORY:$CIRCLE_BUILD_NUM
TAG="tc-terms-service:latest"
docker build -t $TAG .

