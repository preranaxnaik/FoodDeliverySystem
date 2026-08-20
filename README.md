# 🍔 Food Delivery System

A **Java-based Food Delivery System** developed using **Object-Oriented Programming (OOP)** concepts. The project simulates the core operations of an online food delivery platform, including customer management, restaurant and food item management, cart operations, order processing, and delivery management.

---

## 📌 Project Overview

The **Food Delivery System** is a console-based Java application designed to demonstrate how an online food ordering platform can be implemented using Java and OOP principles.

Customers can browse available food items, add items to their cart, place orders, and manage their orders. The project follows a modular structure by separating **entities** and **service-layer operations**, making the application easier to understand, maintain, and extend.

---

## ✨ Key Highlights

* 🍽️ Restaurant and food item management
* 👤 Customer management
* 🍔 Food item browsing
* 🛒 Cart management
* 📦 Order placement and processing
* 🚴 Delivery person management
* 🧩 Entity-based application design
* ⚙️ Service-layer implementation
* 💻 Console-based user interface
* 📚 Java Collections Framework
* 🔐 Encapsulation and inheritance
* 🏗️ Modular package structure

---

## 🚀 Features

### 👤 Customer Management

* Add and manage customer information
* Maintain customer details
* Associate customers with orders and carts

### 🍽️ Restaurant Management

* Store restaurant information
* Manage restaurants associated with food items

### 🍔 Food Item Management

* Add and manage food items
* Store food item details such as name, price, and availability
* Browse available food items

### 🛒 Cart Management

* Add food items to the cart
* Manage selected food items
* Calculate the order/cart details

### 📦 Order Management

* Place orders using cart items
* Maintain order information
* Process customer orders

### 🚴 Delivery Management

* Maintain delivery person information
* Associate delivery personnel with orders

---

## 🛠️ Technologies Used

| Technology                     | Purpose                      |
| ------------------------------ | ---------------------------- |
| **Java**                       | Core programming language    |
| **OOP**                        | Application design           |
| **Java Collections Framework** | Data management              |
| **Scanner**                    | Console input                |
| **Eclipse IDE**                | Development environment      |
| **Git**                        | Version control              |
| **GitHub**                     | Repository and collaboration |

---

## 🏗️ Application Architecture

The project follows a simple layered structure consisting of an **Application Layer**, **Service Layer**, and **Entity Layer**.

```text
                    FOOD DELIVERY SYSTEM
                           │
                           ▼
                  Application Layer
                           │
                           ▼
                    Service Layer
              ┌────────────┼────────────┐
              ▼            ▼            ▼
       CustomerService FoodService OrderService
              │            │            │
              └────────────┼────────────┘
                           ▼
                     Entity Layer
                           │
       ┌─────────┬─────────┼─────────┬──────────┐
       ▼         ▼         ▼         ▼          ▼
     User    Customer   FoodItem   Restaurant   Cart
                                                  │
                                                  ▼
                                                Order
                                                  │
                                                  ▼
                                           DeliveryPerson
```

### Application Layer

Responsible for starting and controlling the console application.

### Service Layer

Contains the business logic and operations performed on customers, food items, and orders.

### Entity Layer

Contains the classes representing the main objects of the food delivery system.

---

## 📂 Project Structure

```text
FoodDeliverySystem
│
├── src
│   └── com
│       └── tns
│           └── fooddeliverysystem
│
│               ├── application
│               │   └── FoodDeliverySystem.java
│               │
│               ├── entities
│               │   ├── User.java
│               │   ├── Customer.java
│               │   ├── FoodItem.java
│               │   ├── Restaurant.java
│               │   ├── Cart.java
│               │   ├── Order.java
│               │   └── DeliveryPerson.java
│               │
│               └── services
│                   ├── CustomerService.java
│                   ├── FoodService.java
│                   └── OrderService.java
│
├── README.md
└── .gitignore
```

---

## 🧩 Main Components

### Entity Classes

| Class            | Responsibility                               |
| ---------------- | -------------------------------------------- |
| `User`           | Stores common user information               |
| `Customer`       | Represents a customer using the system       |
| `FoodItem`       | Represents food items available for ordering |
| `Restaurant`     | Stores restaurant-related information        |
| `Cart`           | Manages food items selected by a customer    |
| `Order`          | Represents customer orders                   |
| `DeliveryPerson` | Represents delivery personnel                |

### Service Classes

| Service           | Responsibility                       |
| ----------------- | ------------------------------------ |
| `CustomerService` | Handles customer-related operations  |
| `FoodService`     | Handles food item-related operations |
| `OrderService`    | Handles order-related operations     |

---

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
             Review Cart
                   │
                   ▼
             Place Order
                   │
                   ▼
          Order Processing
                   │
                   ▼
          Assign Delivery
                   │
                   ▼
          Delivery Person
                   │
                   ▼
            Food Delivered
```

---

## 💡 OOP Concepts Demonstrated

The project demonstrates important Java Object-Oriented Programming concepts.

### 1. Classes and Objects

The system models real-world entities such as customers, restaurants, food items, carts, and orders using Java classes and objects.

### 2. Encapsulation

Data and related methods are grouped within classes. Access modifiers are used to control access to object data.

### 3. Inheritance

Common properties can be reused through inheritance. For example, `Customer` can inherit common user-related information from `User`.

```text
User
  │
  ▼
Customer
```

### 4. Polymorphism

The project can demonstrate polymorphism through inherited methods and their implementation in derived classes.

### 5. Abstraction

The system separates the implementation of business operations from the objects that represent the system.

### 6. Constructors

Constructors are used to initialize entity objects with their required information.

### 7. Methods

Methods are used to perform operations such as adding food items, managing customers, and processing orders.

### 8. Collections

Java Collections Framework can be used to store and manage multiple customers, food items, restaurants, and orders.

### 9. Packages

The project is organized into separate packages:

```text
application
entities
services
```

This improves code organization and maintainability.

### 10. Exception Handling

Exception handling can be used to handle invalid inputs and unexpected runtime conditions.

> **Note:** The exact OOP concepts listed above should correspond to the implementations actually present in the source code.

---

## 🖥️ Sample Console Flow

A typical interaction with the application can follow this workflow:

```text
========================================
       FOOD DELIVERY SYSTEM
========================================

1. Customer Management
2. Food Item Management
3. Cart Management
4. Order Management
5. Delivery Management
6. Exit

Enter your choice:
```

Example ordering flow:

```text
Customer
   ↓
View Available Food
   ↓
Select Food Item
   ↓
Add Item to Cart
   ↓
View Cart
   ↓
Place Order
   ↓
Order Processed
   ↓
Delivery Assigned
```

> Replace the sample console flow above with an actual screenshot or output from `FoodDeliverySystem.java` if you want the README to represent the exact current implementation.

---

## ⚙️ Requirements

Before running the project, make sure the following are installed:

* **Java JDK 8 or above**
* **Eclipse IDE** or another Java-compatible IDE
* **Git** (optional, for cloning the repository)

Verify Java installation:

```bash
java -version
```

Verify the Java compiler:

```bash
javac -version
```

---

## ▶️ How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/preranaxnaik/FoodDeliverySystem.git
```

Navigate to the project:

```bash
cd FoodDeliverySystem
```

---

### 2. Open the Project in Eclipse

1. Open **Eclipse IDE**.
2. Select **File → Import**.
3. Select **Existing Projects into Workspace**.
4. Browse to the cloned `FoodDeliverySystem` folder.
5. Click **Finish**.
6. Allow Eclipse to build the project.

---

### 3. Run the Application

Open:

```text
src/com/tns/fooddeliverysystem/application/FoodDeliverySystem.java
```

Right-click the file and select:

```text
Run As → Java Application
```

The application will start in the Eclipse console.

---

## 🎯 Objective

The main objective of this project is to develop a simple and modular food delivery application while applying **Java programming and Object-Oriented Programming concepts** to a practical real-world problem.

The project also provides practical experience in:

* Java class design
* Object-oriented modelling
* Service-layer architecture
* Collection handling
* Console-based application development
* Git and GitHub collaboration
* Modular code organization

---

## 🔮 Future Enhancements

The current console-based system can be extended into a complete food delivery platform.

### 🗄️ Database

* MySQL database integration
* Persistent customer records
* Persistent restaurant and food data
* Order history storage

### 🔐 Authentication

* Customer registration
* Login and logout
* Password management
* Role-based access

### 💳 Payment

* Online payment integration
* Multiple payment methods
* Payment transaction records
* Payment status management

### 📍 Order Tracking

* Real-time order status
* Delivery tracking
* Estimated delivery time
* Delivery status notifications

### 🔎 Restaurant & Food Search

* Restaurant search
* Food category filtering
* Price-based filtering
* Restaurant ratings

### ⭐ Reviews and Ratings

* Food ratings
* Restaurant reviews
* Customer feedback
* Rating-based restaurant sorting

### 🌐 Web Application

The Java backend can be converted into a REST-based application using:

* Spring Boot
* Spring Data JPA
* REST APIs
* MySQL

A frontend can then be developed using:

* HTML
* CSS
* JavaScript
* React

### 📊 Admin Dashboard

An administrator dashboard could provide:

* Customer management
* Restaurant management
* Food management
* Order management
* Delivery management
* Sales and order statistics

---

## 🧪 Possible Testing Scenarios

The application can be tested using scenarios such as:

| Test Scenario          | Expected Result                               |
| ---------------------- | --------------------------------------------- |
| Add a new customer     | Customer is added successfully                |
| View food items        | Available food items are displayed            |
| Add food to cart       | Selected item is added to cart                |
| View cart              | Cart items are displayed                      |
| Place an order         | Order is created successfully                 |
| Process an order       | Order status is updated                       |
| Assign delivery person | Delivery information is associated with order |
| Invalid menu choice    | Appropriate validation/error message          |
| Empty cart order       | System prevents invalid order placement       |

---

## 📈 Project Learning Outcomes

Through this project, developers gain practical experience in:

* Designing Java classes
* Applying OOP principles
* Creating relationships between entities
* Implementing service classes
* Using Java Collections
* Handling console input
* Structuring a Java project
* Working collaboratively using Git and GitHub
* Understanding basic software architecture

---

## 👩‍💻 Contributors

This project was developed collaboratively as a Java academic project.

| Contributor        |
| ------------------ |
| **Prerana Naik**   |
| **Krushna Hajare** |
| **Sneha Shingare** |
| **Jui Shilimkar**  |
| **Sneha Jadhav**   |
| **Vedika Aher**    |

---

## 🤝 Collaboration

The project was developed collaboratively using **Git and GitHub**.

Typical workflow:

```text
Clone Repository
       ↓
Create / Modify Code
       ↓
Test Changes
       ↓
git add
       ↓
git commit
       ↓
git push
       ↓
GitHub Repository
```

---

## 📌 Project Status

**Status:** Completed — Academic / Educational Project

The current version provides a console-based implementation of the basic food delivery workflow. Additional features such as database integration, authentication, online payments, tracking, REST APIs, and a graphical/web interface can be implemented in future versions.

---

## 📄 License

This project is developed for **educational and academic purposes**.

---

## ⭐ Acknowledgement

This project was developed as part of practical Java and Object-Oriented Programming learning, with the objective of applying theoretical concepts to a real-world food delivery use case.

---

## 🔗 Repository

**GitHub Repository:**
https://github.com/preranaxnaik/FoodDeliverySystem

---

### 🍔 Food Delivery System

**Java • OOP • Collections • Service Layer • Git • GitHub**
