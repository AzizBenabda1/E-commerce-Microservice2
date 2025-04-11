# 🚚 Logistics Microservice Documentation

> This microservice handles **shipment tracking** and **warehouse management** within the **E-commerce platform**. It manages the creation, tracking, and status of shipments, as well as warehouse operations including storage and inventory tracking.

---

## 🧱 General Project Structure

```plaintext
ecommerce-platform/
├── backend/
│   └── logistics-service/  # Handles logistics, shipment tracking, and warehouse management
└── frontend/
    └── ecommerce-app/      # Angular application (UI)
```

---

## ⚙️ Technologies Used

### Backend
- **Java 17**
- **Spring Boot 3.4.2**
- **Spring Data JPA** for database management
- **MySQL** for storage
- **Docker** for containerization

### Frontend
- **Angular 17+**
- **Bootstrap / TailwindCSS** for design
- **JWT Authentication** for secure user management

---

## 📦 Functional Modules

### 🚚 Logistics
- **Shipment**: Track and manage the lifecycle of shipments from creation to delivery.
- **Warehouse**: Manage warehouse details, including storage capacity and inventory.

---

## 📜 Entities

### **Shipment Entity**

The `Shipment` entity represents a shipment, from creation to delivery. It tracks the shipment's details, including its current status, destination, and carrier.

#### **Fields**:
- **`id`** (`Long`):  
  The unique identifier for the shipment (auto-generated).
  
- **`trackingNumber`** (`String`):  
  A unique tracking number assigned to the shipment (required).

- **`carrier`** (`String`):  
  The carrier responsible for the shipment (e.g., FedEx, UPS).

- **`status`** (`String`):  
  The current status of the shipment (e.g., "In Transit", "Delivered").

- **`destination`** (`String`):  
  The destination address of the shipment.

- **`shipmentDate`** (`LocalDateTime`):  
  The date and time the shipment was created.

- **`estimatedDeliveryDate`** (`LocalDateTime`):  
  The estimated delivery date.

---

### **Warehouse Entity**

The `Warehouse` entity represents a warehouse that stores products. It tracks essential details like **capacity**, **current inventory**, and **location**.

#### **Fields**:
- **`id`** (`Long`):  
  The unique identifier for the warehouse (auto-generated).

- **`name`** (`String`):  
  The name of the warehouse (required).

- **`location`** (`String`):  
  The address or location of the warehouse.

- **`capacity`** (`Integer`):  
  The maximum number of units the warehouse can store.

- **`currentInventory`** (`Integer`):  
  The number of units currently stored in the warehouse.

- **`createdAt`** (`LocalDateTime`):  
  The timestamp when the warehouse was created.

---

## 🔗 API Endpoints

### 🚚 Shipment Controller
| Method | Endpoint               | Description                     |
|--------|-------------------------|---------------------------------|
| GET    | `/api/shipments`       | Retrieve all shipments          |
| POST   | `/api/shipments`       | Create a new shipment           |
| GET    | `/api/shipments/{id}`  | Retrieve a shipment by ID       |
| PUT    | `/api/shipments/{id}`  | Update a shipment by ID         |
| DELETE | `/api/shipments/{id}`  | Delete a shipment by ID         |

### 🏢 Warehouse Controller
| Method | Endpoint               | Description                     |
|--------|-------------------------|---------------------------------|
| GET    | `/api/warehouses`      | Retrieve all warehouses         |
| POST   | `/api/warehouses`      | Create a new warehouse          |
| GET    | `/api/warehouses/{id}` | Retrieve a warehouse by ID      |
| PUT    | `/api/warehouses/{id}` | Update a warehouse by ID        |
| DELETE | `/api/warehouses/{id}` | Delete a warehouse by ID        |

---

## 🎨 User Interface

### Angular Features:
- **Shipment Tracking**: Users can track shipments using tracking numbers.
- **Warehouse Management**: Admins can create, update, and monitor warehouses.
- **Real-time Shipment Status**: Users can see updated statuses instantly.

---

## 🖥️ Running the Project

### Backend
```bash
cd backend/logistics-service/
./mvnw spring-boot:run
```

### Frontend
```bash
cd frontend/ecommerce-app/
npm install
ng serve --open
```

Accessible via: [http://localhost:4200](http://localhost:4200)

---

## 🎯 Roadmap
- ✅ Authentication with JWT or Keycloak
- ✅ Admin Panel for managing shipments and warehouses
- ✅ Inventory Management with live stock updates
- ✅ Notification system for shipment updates

---

## 🛠️ Contribution

1. **Fork the project**.

2. **Create a feature branch**:
   ```bash
   git checkout -b feature/my-feature
   ```

3. **Commit your changes**:
   ```bash
   git commit -m 'Added feature'
   ```

4. **Push your branch**:
   ```bash
   git push origin feature/my-feature
   ```

5. **Open a pull request** and get it reviewed.

---

## 📝 License

This project is licensed under the MIT License – free to use and modify.

---

## 🔗 Useful Links
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Angular Documentation](https://angular.io/docs)
- [GitHub Repository](#)
