FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-category-services.jar
EXPOSE 7007
ENTRYPOINT ["java", "-jar", "/app/spring-category-services.jar"]
