# 📦 Microservices : Produit & Panier

Application backend pour la gestion des produits et des paniers dans une plateforme e-commerce. Développée avec **Spring Boot**, **Docker** et une architecture **microservices**.



### 📁 Structure du projet

| Chemin                                      | Description                                 |
|--------------------------------------------|---------------------------------------------|
| `ecommerce-microservices/`                 | Racine du projet                            |
| ├── `produit-service/`                     | Microservice principal                      |
| │   ├── `src/main/java/controller/`        | Contrôleurs REST                            |
| │   ├── `src/main/java/entity/`            | Entités JPA                                 |
| │   ├── `src/main/java/repository/`        | Repositories Spring Data                    |
| │   ├── `src/main/java/service/`           | Couche métier                               |
| │   └── `src/main/resources/`              | Ressources de configuration                 |
| │       └── `application.properties`       | Fichier de configuration principal          |
| ├── `Dockerfile`                           | Configuration Docker du microservice        |
| └── `pom.xml`                              | Fichier de configuration Maven              |
| `docker-compose.yml`                       | Orchestration des conteneurs Docker         |






## 🚀 Technologies utilisées

### 🖥️ Backend

- **Java 17**
- **Spring Boot 3.x**
- **Spring Cloud**
- **Eureka Discovery Server**
- **API Gateway (Spring Cloud Gateway)**
- **Spring Data JPA**
- **MySQL 8.0**
- **Docker & Docker Compose**
- **Lombok**
- **SpringDoc OpenAPI** (documentation Swagger)

---

## 🔧 Fonctionnalités principales

### 🛒 Module Produit
- Création, modification et suppression de produits
- Liste des produits filtrés par catégorie
- Gestion des stocks

### 🛍️ Module Panier
- Création de panier par utilisateur
- Ajout et suppression de produits dans le panier
- Calcul automatique du total
- Persistance des paniers en base

---

## 🔗 Architecture Microservices

| Microservice     | Port | Rôle                               |
|------------------|------|------------------------------------|
| `produit-service`| 8096 | Gestion des produits et des paniers |
| `eureka-server`  | 8761 | Service Discovery (registre Eureka) |
| `api-gateway`    | 8065 | Point d’entrée unique (routing)    |
| `mysql-db`       | 3306 | Base de données principale         |

---

## 🧪 Endpoints API (via API Gateway)

### 📦 Produits

| Méthode | Endpoint              | Description               |
|---------|-----------------------|---------------------------|
| GET     | `/produit/liste`      | Lister tous les produits  |
| POST    | `/produit/ajouter`    | Ajouter un nouveau produit |
| GET     | `/produit/{id}`       | Détails d’un produit      |

### 🛒 Paniers

| Méthode | Endpoint                            | Description                    |
|---------|-------------------------------------|--------------------------------|
| POST    | `/panier/creer`                     | Créer un nouveau panier        |
| POST    | `/panier/{id}/ajouter`              | Ajouter un produit au panier   |
| GET     | `/panier/{id}`                      | Voir le contenu d’un panier    |
| DELETE  | `/panier/{id}/produit/{pid}`        | Supprimer un produit du panier |

---

## 👨‍💻 Auteur

**Wassim Hajji**  
📧 [wassimhajji11@gmail.com](mailto:wassimhajji11@gmail.com)  
🔗 [GitHub](https://github.com/) | [LinkedIn](https://linkedin.com/)

---
