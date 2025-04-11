<<<<<<< HEAD
Fehd aziz
=======
# 🛒 E-Commerce Microservices Platform

> E-commerce platform developed with **microservices architecture** using **Spring Boot** and **Angular**, allowing you to manage **products**, **orders**, **logistics**, **invoices**, **reviews**, and more.

---

## 🧱 General Project Structure

```
ecommerce-platform/
├── backend/
│   ├── config-service/         # Centralized config (Spring Cloud Config)
│   ├── discovery-service/      # Eureka Server for service discovery
│   ├── gateway-service/        # API Gateway
│   ├── user-service/           # User management
│   ├── product-service/        # Product management
│   ├── order-service/          # Order and invoice management
│   ├── review-service/         # Review tracking
│   ├── reclamation-service/    # Reclamation management
├── frontend/
    └── ecommerce-app/          # Angular application (UI)
```

---

## ⚙️ Technologies Used

### Backend
- **Java 17**
- **Spring Boot 3.4.2**
- **Spring Cloud 2023.0.1**
- **Eureka Server** for service discovery
- **Spring Cloud Gateway** for API management
- **Spring Data JPA**
- **MySQL** for database management
- **Docker** and **Docker Compose** for orchestration

### Frontend
- **Angular 17+**
- **Bootstrap** / **TailwindCSS** for design
- **JWT Authentication** for user management
- **Angular Router** and **Services** for handling navigation and API calls

---

## 📦 Functional Modules

### 🛍️ Product
- CRUD operations for products
- Filtering by category, price, etc.
- Stock management and availability

### 🧾 Order
- Creation and management of orders
- Client/product association
- Order status tracking (pending, shipped…)

### 🚚 Logistics
- Shipment tracking
- Carrier information
- Real-time order tracking

### 💳 Invoice
- Automatic invoice generation
- Payment status
- Stripe integration for payment management (under development)

---

## 🖥️ Running the Project

### Backend

```bash
cd backend/
# Launch the services in order:
1. config-service
2. discovery-service
3. gateway-service
4. product-service
5. order-service
6. invoice-service
7. reclamation-service
8. review-service
9. user-service
```

Typical command to start a service:
```bash
./mvnw spring-boot:run
```

### Frontend

```bash
cd frontend/ecommerce-app/
npm install
ng serve --open
```

The Angular UI will be available at: `http://localhost:4200`

---

## 🔗 Example Endpoints

### Product
- `GET    /api/products` - Retrieve all products
- `POST   /api/products` - Create a new product
- `GET    /api/products/{id}` - Retrieve a product by its ID
- `DELETE /api/products/{id}` - Delete a product

### Order
- `POST   /api/orders` - Create a new order
- `GET    /api/orders/client/{id}` - Retrieve a client's orders
- `PUT    /api/orders/{id}` - Update an order

### Logistics
- `GET    /api/logistics/track/{orderId}` - Track the order
- `POST   /api/logistics/ship` - Mark an order as shipped

---

## 🎨 User Interface

Angular Features:
- **Product catalog** with search and filtering
- **Shopping cart** and product management
- **Order tracking** in real time
- **Invoice generation** from orders
- **Stripe Payment** (feature under development)

---

## 🎯 Roadmap

- [ ] **Authentication** with JWT or Keycloak
- [ ] **Online payment** via Stripe
- [ ] **Order confirmation email**
- [ ] **Admin Panel** for managing products and orders
- [ ] **Sales statistics** and reports
- [ ] **Frontend optimization** with Lazy Loading

---

## 🛠️ Contribution

1. Fork the project.
2. Create a branch for your feature (`git checkout -b feature/my-feature`).
3. Commit your changes (`git commit -m 'Added feature'`).
4. Push your branch (`git push origin feature/my-feature`).
5. Open a *pull request* to discuss your changes.

---

## 📝 Review and Code Quality

We encourage regular code reviews. If you wish to contribute, make sure:
- The code is tested (unit and integration).
- The code follows best development practices (naming conventions, exception handling).
- New features are well documented.

### **Micro-Reviews**
Micro-reviews are a quick process of examining small portions of code (specific features, bug fixes). They are useful for:
- **Improving code quality**
- **Identifying performance or security issues early**
- **Facilitating understanding of changes** for other developers.

For **code reviews**, please open a *pull request*, and a team member will validate it. We use **GitHub Actions** for automatic test verification.

---

## 👥 Development Team

 -👤 **Développeur 1*Wassim Hajii* – Microservice Produit
- 👤 **Développeur 2*Mouhamed Aziz Ben Abda* – Microservice Commande
- 👤 **Développeur 3*Fehd ounis* – Microservice Review
- 👤 **Développeur 4*Aziz Bouzidi* – Microservice Logistique
- 👤 **Développeur 4*Ines Ketata* – Microservice Reclamation
- 👤 **Développeur 4*Oussema ben ghazel =* – Microservice User


---

## 📝 License

Project under the **MIT** license. Free and open-source use.

---

## 🔗 Useful Links

- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Angular Official Documentation](https://angular.io/docs)
- [GitHub Repository](https://github.com/your-repository)

---

> 💬 Feel free to open an *issue* to report a bug or suggest an improvement.
>>>>>>> e20a847 (addition of another entity  on Fehd branch)
