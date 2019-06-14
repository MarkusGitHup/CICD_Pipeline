#FROM java:8
FROM openjdk:8-jre-alpine

WORKDIR /app
ADD ./build/libs/Parcelsize-0.1.jar Parcelsize-0.1.jar

EXPOSE 8082

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","Parcelsize-0.1.jar"]
