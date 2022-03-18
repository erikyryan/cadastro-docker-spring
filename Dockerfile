FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /target/cadastro-0.0.1-SNAPSHOT.jar cadastro.jar
ENTRYPOINT ["java","-jar","cadastro.jar"]