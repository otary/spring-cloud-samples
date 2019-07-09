@echo off
mvn package & start spring-cloud-basic-eureka\spring-cloud-basic-eureka-server\startup.cmd & start spring-cloud-basic-eureka\spring-cloud-basic-eureka-client\startup.cmd

