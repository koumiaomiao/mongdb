./gradlew clean bootJar
docker build -t koumiaojuan/mongdb:0.0.6-SNAPSHOT .
docker run -p 8085:8085 koumiaojuan/mongdb:0.0.6-SNAPSHOT

docker pull mongo
docker pull openjdk:17-jdk-alpine


