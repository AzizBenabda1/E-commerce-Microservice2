FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8098
ADD target/Logistics-0.0.1-SNAPSHOT.jar Logistics.jar
ENTRYPOINT ["java", "-jar","Logistics.jar"]