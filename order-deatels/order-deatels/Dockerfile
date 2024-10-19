FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-order-services.jar
EXPOSE 7003
ENTRYPOINT ["java", "-jar", "/app/spring-order-services.jar"]
