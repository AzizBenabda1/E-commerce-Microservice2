FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8093
ADD target/CommandeService-0.0.1-SNAPSHOT.jar CommandeService.jar
ENTRYPOINT ["java", "-jar","CommandeService.jar"]