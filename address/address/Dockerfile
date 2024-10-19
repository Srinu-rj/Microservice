#FROM openjdk:17
#EXPOSE 8998
#COPY target/spring-image.jar .
#ENTRYPOINT ["java","-jar","/spring-image.jar"]
#

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-image.jar
EXPOSE 8998
ENTRYPOINT ["java", "-jar", "/app/spring-image.jar"]
