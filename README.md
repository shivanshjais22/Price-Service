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
<br>├── controller
<br>│ └── Controllerprice.java
<br>├── dto
<br>│ └── Pricedto.java
<br>├── model
<br>│ └── Price.java
<br>├── repository
<br>│ └── PriceRepository.java
<br>├── service
<br>│ └── PriceService.java
<br>│ └── PriceServiceImpl.java
<br>└── DemoApplication.java

## 🔗 REST API Endpoints

### 1. Create Price  
**POST** `/price`

Registers a new price for a product.

**Request Body**:
```json
{
  "productId": 1,
  "basePrice": 999.99,
  "discountPercent": 10.0
}
2. Get Price by Product ID
GET /price/{productId}

Returns the base price and discount percentage for a given product.

Sample Response:

json
{
  "productId": 1,
  "basePrice": 999.99,
  "discountPercent": 10.0
}
3. Get Discounted Price
GET /price/discounted/{productId}

Calculates and returns the final discounted price using the formula:

ini
Copy code
discountedPrice = basePrice - (basePrice * discountPercent / 100)
Sample Response:


899.99
⚙️ Integration with Product Service
The Product Service fetches price info using RestTemplate or WebClient. Example usage:

PriceDto priceDto = restTemplate.getForObject("http://localhost:9091/price/" + productId, PriceDto.class);

