@echo off

set APP_FILE=%~dp0%/target/spring-cloud-basic-feign-0.0.1-SNAPSHOT.jar

if not exist %APP_FILE% (
    mvn install & java -jar %APP_FILE%
)else (
   java -jar %APP_FILE%
)