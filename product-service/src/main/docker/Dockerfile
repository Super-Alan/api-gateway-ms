FROM openjdk:8-jdk-alpine
MAINTAINER Alan Zhao <alan.zhao@cifnews.com>
VOLUME /tmp
EXPOSE 8082
WORKDIR /app
COPY  ./product-service-0.0.1.jar  /app/product-service.jar
ENTRYPOINT ["sh","-c","java $OPTIONS -jar /app/product-service.jar"]