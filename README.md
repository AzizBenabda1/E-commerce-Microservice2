📢 Reclamation Management System  
Application Fullstack pour la gestion des réclamations clients, développée avec Spring Boot (Microservices) et Angular.

📁 Structure du projet  
project-root/  
├── backend/  
│   ├── config-service/  
│   ├── discovery-service/  
│   ├── gateway-service/  
│   └── reclamation-service/  
└── frontend/  
    └── reclamation-app/

🚀 Technologies utilisées  

🖥️ Backend  
- Java 17  
- Spring Boot 3.4.2  
- Spring Cloud 2023.0.1  
- Spring Cloud Config Server  
- Eureka Discovery  
- Spring Cloud Gateway  
- Spring Data JPA  
- MySQL  
- RabbitMQ (optionnel pour events)  
- Docker (optionnel)  

🌐 Frontend  
- Angular 17+  
- Angular Router  
- Angular HttpClient  
- Angular Material (optionnel)  
- Bootstrap (optionnel)  

🔧 Fonctionnalités  

📨 Réclamation  
- Créer une réclamation  
- Lister toutes les réclamations  
- Voir les détails d’une réclamation  
- Modifier ou supprimer une réclamation  
- Suivre l’état de traitement (en attente, traitée, rejetée)  
- (Optionnel) Notifier le client par email ou via RabbitMQ  

🔙 Microservices Backend  

| Microservice        | Description                                 |
|---------------------|---------------------------------------------|
| config-service      | Fournit les configurations centralisées     |
| discovery-service   | Enregistre les microservices (Eureka Server)|
| gateway-service     | Point d’entrée API via Spring Cloud Gateway |
| reclamation-service | Gère les entités et logique de réclamation  |

🧪 Comment exécuter le projet  

✅ Backend  
```bash
cd backend/

# Lancer chaque service dans cet ordre :
1. config-service
2. discovery-service
3. gateway-service
4. reclamation-service

# Commandes de lancement (par service) :
./mvnw spring-boot:run
