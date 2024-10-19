FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-address-services.jar
EXPOSE 7008
ENTRYPOINT ["java", "-jar", "/app/spring-bill-services.jar"]
