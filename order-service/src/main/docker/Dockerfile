FROM openjdk:8-jdk-alpine
MAINTAINER Alan Zhao <alan.zhao@cifnews.com>
VOLUME /tmp
EXPOSE 8080
WORKDIR /app
COPY  ./order-service-0.0.1.jar  /app/order-service.jar
ENTRYPOINT ["sh","-c","java $OPTIONS -jar /app/order-service.jar"]