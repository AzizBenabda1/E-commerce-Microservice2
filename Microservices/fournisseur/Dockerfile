FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8097
ADD target/fournisseur-0.0.1-SNAPSHOT.jar fournisseur.jar
ENTRYPOINT ["java", "-jar","fournisseur.jar"]