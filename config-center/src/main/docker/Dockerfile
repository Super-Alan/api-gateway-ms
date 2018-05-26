FROM openjdk:8-jdk-alpine
MAINTAINER Alan Zhao <alan.zhao@cifnews.com>
VOLUME /tmp
EXPOSE 8888
WORKDIR /app
COPY  ./config-center-0.0.1.jar  /app/config-center.jar
ENTRYPOINT ["sh","-c","java $OPTIONS -jar /app/config-center.jar"]