FROM openjdk:8-jdk-alpine
MAINTAINER Alan Zhao <alan.zhao@cifnews.com>
VOLUME /tmp
EXPOSE 9999
WORKDIR /app
COPY  ./api-gateway-0.0.1.jar  /app/api-gateway.jar
ENTRYPOINT ["sh","-c","java $OPTIONS -jar /app/api-gateway.jar"]