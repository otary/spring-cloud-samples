@echo off

set ZIPKIN_SERVER_APP=zipkin-server
set ZIPKIN_PRODUCER_APP=spring-cloud-basic-zipkin-producer
set ZIPKIN_CONSUMER_APP=spring-cloud-basic-zipkin-consumer

mvn package & start %ZIPKIN_SERVER_APP%\startServer.cmd & start %ZIPKIN_PRODUCER_APP%\startup.cmd & start %ZIPKIN_CONSUMER_APP%\startup.cmd
