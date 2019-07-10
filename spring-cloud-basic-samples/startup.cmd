@echo off

set EUREKA_SERVER_APP=spring-cloud-basic-eureka\spring-cloud-basic-eureka-server
set EUREKA_CLIENT_APP=spring-cloud-basic-eureka\spring-cloud-basic-eureka-client
set RIBBON_APP=spring-cloud-basic-discovery\spring-cloud-basic-ribbon
set FEIGN_APP=spring-cloud-basic-discovery\spring-cloud-basic-feign
set ZUUL_APP=spring-cloud-basic-zuul

mvn package & start %EUREKA_SERVER_APP%\startup.cmd & start %EUREKA_CLIENT_APP%\startup.cmd & start %RIBBON_APP%\startup.cmd & start %FEIGN_APP%\startup.cmd & start %ZUUL_APP%\startup.cmd

