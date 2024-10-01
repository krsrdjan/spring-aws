# spring-aws
Example project to show Spring boot app deployed on AWS instance using Git actions.

Git actions can be configured in project root /.github/workflows directory.

It is a simple Spring application that exposes Web API.

Project uses Git actions to deploy Spring application to AWS free tier instance.

For project setup, Git actions need to have AWS instance ssh key, username and public DNS address.

Deploy script will copy and start application in user folder on target instance.

Here is the link to the running application

http://ec2-3-126-51-47.eu-central-1.compute.amazonaws.com:8080/api/pets/find-all
