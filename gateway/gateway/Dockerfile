FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-gate-services.jar
EXPOSE 8060
ENTRYPOINT ["java", "-jar", "/app/spring-gate-services.jar"]
