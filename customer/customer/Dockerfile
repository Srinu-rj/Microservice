FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-customer-services.jar
EXPOSE 7006
ENTRYPOINT ["java", "-jar", "/app/spring-customer-services.jar"]
