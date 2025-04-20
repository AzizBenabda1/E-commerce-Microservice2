FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8065
ADD target/gateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java", "-jar","gateway.jar"]