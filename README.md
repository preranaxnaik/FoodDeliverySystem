# 🍔 Food Delivery System

A **Java-based Food Delivery System** developed using Object-Oriented Programming concepts. The project simulates the basic operations of an online food delivery platform, including customer management, food items, restaurants, cart management, order processing, and delivery management.

## 📌 Project Overview

The Food Delivery System allows customers to browse food items, add items to their cart, place orders, and manage their orders. The system is organized using separate **Entity** and **Service** classes to maintain clean and modular code.

## 🚀 Features

* 👤 Customer management
* 🍽️ Restaurant management
* 🍔 Food item management
* 🛒 Add and manage items in cart
* 📦 Place and manage orders
* 🚴 Delivery person management
* 🔐 User entity and customer details
* ⚙️ Service-layer implementation for system operations
* 💻 Console-based application

## 🛠️ Technologies Used

* **Java**
* **Object-Oriented Programming (OOP)**
* **Eclipse IDE**
* **Git**
* **GitHub**
* **Java Collections Framework**
* **Scanner for console input**

## 📂 Project Structure

```text
FoodDeliverySystem
│
├── src
│   └── com.tns.fooddeliverysystem
│
│       ├── application
│       │   └── FoodDeliverySystem.java
│       │
│       ├── entities
│       │   ├── User.java
│       │   ├── Customer.java
│       │   ├── FoodItem.java
│       │   ├── Restaurant.java
│       │   ├── Cart.java
│       │   ├── Order.java
│       │   └── DeliveryPerson.java
│       │
│       └── services
│           ├── CustomerService.java
│           ├── FoodService.java
│           └── OrderService.java
│
└── README.md
```

## 🧩 Main Components

### Entities

| Class            | Description                                  |
| ---------------- | -------------------------------------------- |
| `User`           | Stores common user information               |
| `Customer`       | Represents a customer using the system       |
| `FoodItem`       | Represents food items available for ordering |
| `Restaurant`     | Stores restaurant-related information        |
| `Cart`           | Manages food items selected by a customer    |
| `Order`          | Represents customer orders                   |
| `DeliveryPerson` | Represents delivery personnel                |

### Services

| Service           | Responsibility                       |
| ----------------- | ------------------------------------ |
| `CustomerService` | Handles customer-related operations  |
| `FoodService`     | Handles food item-related operations |
| `OrderService`    | Handles order-related operations     |

## 🔄 System Workflow

```text
Customer
   │
   ▼
Browse Food Items
   │
   ▼
Select Food
   │
   ▼
Add to Cart
   │
   ▼
Place Order
   │
   ▼
Order Processing
   │
   ▼
Delivery Person
   │
   ▼
Food Delivered
```

## 💡 OOP Concepts Used

This project demonstrates important Java OOP concepts such as:

* **Classes and Objects**
* **Encapsulation**
* **Inheritance**
* **Polymorphism**
* **Abstraction**
* **Constructors**
* **Methods**
* **Collections**
* **Packages**
* **Exception Handling**

## ▶️ How to Run the Project

### 1. Clone the repository

```bash
git clone https://github.com/preranaxnaik/FoodDeliverySystem.git
```

### 2. Open in Eclipse

1. Open **Eclipse IDE**
2. Select **File → Import**
3. Choose **Existing Projects into Workspace**
4. Select the cloned `FoodDeliverySystem` folder
5. Click **Finish**

### 3. Run the application

Open:

```text
src/com/tns/fooddeliverysystem/application/FoodDeliverySystem.java
```

Right-click the file and select:

**Run As → Java Application**

## 🎯 Objective

The main objective of this project is to develop a simple and modular food delivery application while applying Java programming and Object-Oriented Programming concepts in a practical scenario.

## 🔮 Future Enhancements

The project can be further enhanced by adding:

* Database connectivity using **MySQL**
* User login and authentication
* Online payment integration
* Order tracking
* Restaurant search and filtering
* Food ratings and reviews
* Graphical User Interface
* Spring Boot REST API
* Web or mobile frontend
* Admin dashboard

## 👩‍💻 Contributors

This project was developed as a collaborative Java project.

* Prerana Naik
* Krushna Hajare
* Sneha Shingare
* Jui Shilimkar
* Sneha Jadhav
* Vedika Aher

## 📄 License

This project is developed for **educational and academic purposes**.
