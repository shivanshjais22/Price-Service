# 🧾 Price Service

A dedicated microservice in the E-Commerce system responsible for managing product pricing, including base prices and discounts. This service supports pricing persistence and calculates discounted prices on demand.

---

## 📌 Overview

The **Price Service** enables CRUD operations on product pricing and integrates with the **Product Service** using RESTful APIs. It stores base price and discount percentage for each product and exposes endpoints to fetch both raw and discounted price data.

---

## 🏗️ Tech Stack

- **Language**: Java 17+
- **Framework**: Spring Boot
- **Database**: H2 (In-memory) / MySQL
- **Tools**: Maven, Lombok
- **Communication**: REST (Spring Web)

---

## 📂 Project Structure


com.example.demo
├── controller
│ └── Controllerprice.java
├── dto
│ └── Pricedto.java
├── model
│ └── Price.java
├── repository
│ └── PriceRepository.java
├── service
│ └── PriceService.java
│ └── PriceServiceImpl.java
└── DemoApplication.java
