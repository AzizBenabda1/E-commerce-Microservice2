FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8096
ADD target/Produit-0.0.1-SNAPSHOT.jar Produit.jar
ENTRYPOINT ["java", "-jar","Produit.jar"]