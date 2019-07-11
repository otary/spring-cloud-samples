@echo off

start zipkin-server\startServer.cmd
start cmd /k "cd spring-cloud-basic-zipkin-producer & mvn spring-boot:run"
start cmd /k "cd spring-cloud-basic-zipkin-consumer & mvn spring-boot:run"
