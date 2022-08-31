FROM openjdk:11-ea-11-jdk
EXPOSE 8081
ADD target/FMS-0.0.1-SNAPSHOT.jar nithi.jar
ENTRYPOINT ["java","-jar","/nithi.jar"]