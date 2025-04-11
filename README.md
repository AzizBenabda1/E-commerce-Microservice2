📦 Microservice Produit & Panier
Application backend pour la gestion des produits et paniers e-commerce, développée avec Spring Boot (Microservices) et Docker.

📁 Structure du projet
Copy
ecommerce-microservices/
├── produit-service/          # Microservice principal
│   ├── src/
│   │   ├── main/java/
│   │   │   ├── controller/   # Contrôleurs REST
│   │   │   ├── entity/       # Entités JPA
│   │   │   ├── repository/   # Repositories Spring Data
│   │   │   └── service/      # Couche métier
│   │   └── resources/
│   │       ├── application.properties
│   │       └── ...
│   ├── Dockerfile
│   └── pom.xml
└── docker-compose.yml        # Orchestration des containers

🚀 Technologies utilisées
🖥️ Backend
Java 17

Spring Boot 3.x

Spring Cloud

Eureka Discovery

API Gateway

Spring Data JPA

MySQL 8.0

Docker + Docker Compose

Lombok

SpringDoc OpenAPI (Documentation API)


🔧 Fonctionnalités principales
🛒 Module Produit
Créer/modifier/supprimer des produits

Lister les produits par catégorie

Gestion des stocks

🛍️ Module Panier
Créer un panier utilisateur

Ajouter/supprimer des produits

Calcul automatique du total

Persistance des paniers


🔗 Architecture Microservices
Microservice	Port	Description
produit-service	8096	Gestion produits + paniers
eureka-server	8761	Service Discovery
api-gateway	8065	Point d'entrée unique (Routing)
mysql-db	3306	Base de données principale



🧪 Endpoints API (Via Gateway)
Produits
Méthode	Endpoint	Description
GET	/produit/liste	Lister tous les produits
POST	/produit/ajouter	Ajouter un nouveau produit
GET	/produit/{id}	Détails d'un produit
Paniers
Méthode	Endpoint	Description
POST	/panier/creer	Créer un nouveau panier
POST	/panier/{id}/ajouter	Ajouter un produit au panier
GET	/panier/{id}	Voir le contenu d'un panier
DELETE	/panier/{id}/produit/{pid}	Supprimer un produit du panier


👨‍💻 Auteur
Wassim Hajji
📧 wassimhajji11@gmail.com
🔗 GitHub | LinkedIn
