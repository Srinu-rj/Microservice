FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-item-services.jar
EXPOSE 7004
ENTRYPOINT ["java", "-jar", "/app/spring-item-services.jar"]
