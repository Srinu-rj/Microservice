FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-foodcart-services.jar
EXPOSE 7005
ENTRYPOINT ["java", "-jar", "/app/spring-foodcart-services.jar"]
