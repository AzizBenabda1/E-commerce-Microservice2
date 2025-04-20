FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8094
ADD target/Review-0.0.1-SNAPSHOT.jar Review.jar
ENTRYPOINT ["java", "-jar","Review.jar"]