FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-restaurant-services.jar
EXPOSE 7002
ENTRYPOINT ["java", "-jar", "/app/spring-restaurant-services.jar"]
