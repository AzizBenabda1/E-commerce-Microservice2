FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8092
ADD target/Notification-Microservice-0.0.1-SNAPSHOT.jar Notification-Microservice.jar
ENTRYPOINT ["java", "-jar","Notification-Microservice.jar"]