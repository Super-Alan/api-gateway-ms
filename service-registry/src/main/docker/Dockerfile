FROM openjdk:8-jdk-alpine
MAINTAINER Alan Zhao <alan.zhao@cifnews.com>
VOLUME /tmp
EXPOSE 8761
WORKDIR /app
COPY  ./service-registry-0.0.1-SNAPSHOT.jar  /app/registry.jar
ENTRYPOINT ["sh","-c","java $OPTIONS -jar /app/registry.jar"]