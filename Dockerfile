FROM openjdk:8-jdk-alpine

LABEL maintainer="matt.nohelty@gmail.com"

VOLUME /tmp

EXPOSE 9003

ARG JAR_FILE
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]