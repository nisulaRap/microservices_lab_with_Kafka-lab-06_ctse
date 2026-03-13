# Microservices with Kafka (KRaft Mode)

Event-driven microservices using Spring Boot, Apache Kafka, and Docker.

---

## Prerequisites

- Java 21+
- Maven
- Docker & Docker Compose

---

## Clone & Run

```bash
git clone https://github.com/nisulaRap/microservices_lab_with_Kafka-lab-06_ctse.git
cd microservices_lab_with_Kafka-lab-06_ctse
```

Build each service:

```bash
.\mvnw clean package -DskipTests
```

Build Docker images:

```bash
docker build -t api-gateway-image       ./api-gateway
docker build -t order-service-image     ./order-service
docker build -t inventory-service-image ./inventory-service
docker build -t payment-service-image   ./payment-service
```

Start all containers:

```bash
docker-compose up -d
```

---

## Service Ports

| Service | Port |
|---|---|
| API Gateway | 8080 |
| Order Service | 8081 |
| Inventory Service | 8082 |
| Payment Service | 8083 |
| Kafka | 9092 |

---

## API

### Create Order

```
POST http://localhost:8080/orders
```

```json
{
  "orderId": "ORD-1001",
  "item": "Laptop",
  "quantity": 1
}
```

**Response:** `Order Created & Event Published`
