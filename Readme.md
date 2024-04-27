./gradlew clean bootJar
docker build -t koumiaojuan/mongdb:0.0.6-SNAPSHOT .
docker run -p 8085:8085 koumiaojuan/mongdb:0.0.6-SNAPSHOT

docker pull mongo
docker pull openjdk:17-jdk-alpine

docker起db: docker run -p 27017:27017  mongo:latest
docker run koumiaojuan/mongdb:0.0.6-SNAPSHOT 失败
本地起koumiaojuan/mongdb:0.0.6-SNAPSHOT，数据库的那个地址是localhost就行-----可以访问

如果能够访问，那就把你的mongodb部署到ecs中（定义mongo任务，成功会有ip）
如果部署成功，就把那个暴露出来的ip地址替换localhost，再试一试本地能不能联通，如果能联通，那就这个springboot就可以打包了，打完包就可以部署到ecs


