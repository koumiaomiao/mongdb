FROM openjdk:17-jdk-alpine

COPY build/libs/demo-mongodb-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]