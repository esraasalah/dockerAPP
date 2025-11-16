FROM eclipse-temurin:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/myAppwithDocker-0.0.1-SNAPSHOT.jar  dockerapp.jar
ENTRYPOINT ["java" , "-jar" , "/dockerapp.jar"]
