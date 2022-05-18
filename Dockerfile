FROM openjdk:11
ADD target/docker-0.0.1-SNAPSHOT.jar .
EXPOSE 9000
CMD java -jar docker-0.0.1-SNAPSHOT.jar
