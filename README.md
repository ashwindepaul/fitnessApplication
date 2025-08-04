# 🏋️ Fitness Application – AI-Powered Health & Activity Tracker

A scalable, secure, and intelligent fitness application built with **Spring Boot microservices**, **React.js frontend**, **Keycloak authentication**, and **Gemini AI** integration. Designed to help users track physical activities, monitor progress, and receive smart health insights.

---

## 🚀 Features

- 👤 User Registration & Authentication (Keycloak)
- 🏃 Activity Tracking with custom input
- 🤖 AI-Powered Fitness Recommendations (Google Gemini)
- 🔐 Secure REST APIs (JWT, RBAC)
- 🌐 API Gateway for central routing
- 📡 Eureka for service discovery
- ⚙️ Microservices architecture for scalability

---

## 🛠️ Tech Stack

### 🔙 Backend
- **Spring Boot**
- **Microservices**: `user-service`, `activity-service`, `ai-service`
- **API Gateway**: Spring Cloud Gateway
- **Service Discovery**: Netflix Eureka
- **Security**: Spring Security + Keycloak
- **Gemini AI API** for health & fitness suggestions

### 🖥️ Frontend
- **React.js**
- **Axios** for API calls
- **JWT-based token management**
- Responsive UI

---

## 🧠 AI Integration (Gemini)

The app uses **Gemini (via Google AI API)** to:
- Analyze user input and health patterns
- Provide personalized fitness goals
- Recommend workout plans & healthy habits

---

## 🗂️ Microservices Overview

| Service            | Description                          | Port |
|--------------------|--------------------------------------|------|
| `user-service`     | Manages user data and profiles       | 8081 |
| `activity-service` | Tracks fitness activities            | 8082 |
| `ai-service`       | Handles AI-based suggestions         | 8083 |
| `gateway-service`  | Central entry point for APIs         | 8080 |
| `eureka-server`    | Registers and discovers services     | 8761 |

---

## 🔐 Keycloak Setup

- Keycloak is used for secure login, signup, and role-based access.
- Runs on port `8089` by default.
- Configure realm, client, and roles before use.

---

## 📦 Installation

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/fitness-application.git
   cd fitness-application
