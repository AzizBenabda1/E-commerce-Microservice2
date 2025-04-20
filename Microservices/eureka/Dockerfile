FROM openjdk:17
#utilise le meme port que le fichier application.properties
EXPOSE 8761
ADD target/eureka-0.0.1-SNAPSHOT.jar eureka.jar
ENTRYPOINT ["java", "-jar","eureka.jar"]