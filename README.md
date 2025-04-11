# 🚚 Logistics Microservice Documentation

> This microservice handles **shipment tracking** and **warehouse management** within the **E-commerce platform**. It manages the creation, tracking, and status of shipments, as well as warehouse operations including storage and inventory tracking.

---

## 🧱 General Project Structure

ecommerce-platform/ ├── backend/ │ ├── logistics-service/ # Handles logistics, shipment tracking, and warehouse management ├── frontend/ └── ecommerce-app/ # Angular application (UI)


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

- **`id`** (Long):  
  The unique identifier for the shipment (auto-generated).
  
- **`trackingNumber`** (String):  
  A unique tracking number assigned to the shipment (required).

- **`carrier`** (String):  
  The carrier responsible for the shipment (e.g., FedEx, UPS).

- **`status`** (String):  
  The current status of the shipment (e.g., "In Transit", "Delivered").

- **`destination`** (String):  
  The destination address of the shipment.

- **`shipmentDate`** (LocalDateTime):  
  The date and time the shipment was created.

- **`estimatedDeliveryDate`** (LocalDateTime):  
  The estimated delivery date.

#### **Example Usage**:
```java
Shipment shipment = new Shipment(
    "TRK12345678",          // Tracking Number
    "FedEx",                // Carrier
    "In Transit",           // Status
    "123 Main St, Springfield, IL",  // Destination
    LocalDateTime.now().plusDays(3)   // Estimated Delivery Date
);
Warehouse Entity
The Warehouse entity represents a warehouse that stores products. It tracks essential details like capacity, current inventory, and location.

Fields:
id (Long):
The unique identifier for the warehouse (auto-generated).

name (String):
The name of the warehouse (required).

location (String):
The location (address) of the warehouse.

capacity (Integer):
The storage capacity of the warehouse (number of units it can store).

currentInventory (Integer):
The current number of items stored in the warehouse.

createdAt (LocalDateTime):
The creation date and time of the warehouse record.

Example Usage:

Warehouse warehouse = new Warehouse(
    "Main Warehouse",            // Warehouse Name
    "456 Commerce Rd, Springfield, IL",  // Location
    10000,                       // Capacity
    5000                         // Current Inventory
);

API Endpoints for Shipment and Warehouse
Shipment Controller
GET /api/shipments - Retrieve all shipments

POST /api/shipments - Create a new shipment

GET /api/shipments/{id} - Retrieve a shipment by ID

PUT /api/shipments/{id} - Update a shipment by ID

DELETE /api/shipments/{id} - Delete a shipment by ID

Warehouse Controller
GET /api/warehouses - Retrieve all warehouses

POST /api/warehouses - Create a new warehouse

GET /api/warehouses/{id} - Retrieve a warehouse by ID

PUT /api/warehouses/{id} - Update a warehouse by ID

DELETE /api/warehouses/{id} - Delete a warehouse by ID

🎨 User Interface
Angular Features:
Shipment Tracking: Users can track shipments by tracking number.

Warehouse Management: Administrators can manage warehouse details and inventory.

Real-time Shipment Status: Get live updates on the status of shipments.

🖥️ Running the Project
Backend
bash
Copy
Edit
cd backend/logistics-service/
# Launch the service:
./mvnw spring-boot:run
Frontend
bash
Copy
Edit
cd frontend/ecommerce-app/
npm install
ng serve --open
The Angular UI will be available at: http://localhost:4200

🔗 Example Endpoints
Shipment
GET /api/shipments - Retrieve all shipments

POST /api/shipments - Create a new shipment

GET /api/shipments/{id} - Retrieve a shipment by ID

PUT /api/shipments/{id} - Update a shipment

DELETE /api/shipments/{id} - Delete a shipment

Warehouse
GET /api/warehouses - Retrieve all warehouses

POST /api/warehouses - Create a new warehouse

GET /api/warehouses/{id} - Retrieve a warehouse by ID

PUT /api/warehouses/{id} - Update a warehouse

DELETE /api/warehouses/{id} - Delete a warehouse

🎯 Roadmap
 Authentication with JWT or Keycloak

 Admin Panel for managing shipments and warehouses

 Inventory Management for real-time updates on stock levels

 Notification system for shipment updates

🛠️ Contribution
Fork the project.

Create a branch for your feature (git checkout -b feature/my-feature).

Commit your changes (git commit -m 'Added feature').

Push your branch (git push origin feature/my-feature).

Open a pull request to discuss your changes.

📝 License
Project under the MIT license. Free and open-source use.

🔗 Useful Links
Spring Boot Official Documentation

Angular Official Documentation

GitHub Repository

