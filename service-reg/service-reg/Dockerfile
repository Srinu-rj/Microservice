FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-Eruka-server.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app/spring-Eruka-server.jar"]
