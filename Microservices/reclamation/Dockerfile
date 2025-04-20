FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8095
ADD target/reclamation-0.0.1-SNAPSHOT.jar reclamation.jar
ENTRYPOINT ["java", "-jar","reclamation.jar"]