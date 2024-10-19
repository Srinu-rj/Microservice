FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/spring-image.jar /app/spring-config-server.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "/app/spring-config-server.jar"]
