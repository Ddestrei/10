FROM openjdk:19 as builder

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]