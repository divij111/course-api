FROM openjdk:11
EXPOSE 8080
ADD target/rest-spring-boot-docker.jar rest-spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/rest-spring-boot-docker.jar"]