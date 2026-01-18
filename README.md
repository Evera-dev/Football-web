# ⚽ Gol de Oro - Football Web Application

**Gol de Oro** is a robust backend platform designed to centralize and manage statistics, live scores, and league data for Paraguayan football. Inspired by platforms like *Promiedos*, this project aims to provide a modern, high-performance, and scalable alternative for local football fans and data analysts.

## 🚀 Project Vision
The core mission is to deliver a high-availability API that serves real-time information about the Paraguayan tournament. The system is architectured for high scalability, allowing easy expansion to other leagues or sports disciplines.

## 🛠️ Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot 3
* **Architecture:** Hexagonal (Ports & Adapters) to ensure decoupling and long-term maintainability.
* **Database:** PostgreSQL
* **Migration Tool:** Flyway (database version control).
* **Containerization:** Docker & Docker Compose.
* **API Testing:** Bruno (test collection included in `src/test/bruno`).

## 🏗️ Architecture & Design
This project goes beyond a simple CRUD. It implements **Hexagonal Architecture** (Clean Architecture) principles:
* **Domain:** Core business logic and models (`League`, `Match`, `Season`) independent of external frameworks.
* **Application:** Use cases and input/output ports (interfaces).
* **Infrastructure:** Implementation of persistence adapters (Spring Data JPA), REST controllers, and external configurations.

## 🐳 Quick Start
To spin up the development environment with the integrated database:

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/Evera-dev/Football-web.git](https://github.com/Evera-dev/Football-web.git)
    ```
2.  **Set up environment variables:**
    Create a `.env` file in the root directory (refer to `env_example` for the required keys).
3.  **Run with Docker:**
    ```bash
    docker-compose up -d
    ```
4.  **Access the API:**
    The service will be available at `http://localhost:8080`.

## 📈 Roadmap
- [ ] Integration with external sports data providers for live updates.
- [ ] Admin authentication and authorization system (Spring Security).
- [ ] Frontend development (React/Next.js) inspired by Promiedos' UX.
- [ ] Cloud Deployment (AWS/Azure).

---
*Developed with ❤️ for the Paraguayan football community.*
