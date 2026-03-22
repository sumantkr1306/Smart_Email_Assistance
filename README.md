# 🚀 Smart Email Assistant (AI-Powered Chrome Extension)

## 📌 Overview

Smart Email Assistant is a Chrome Extension that enhances Gmail by generating AI-powered email replies automatically. It integrates directly into the Gmail UI, extracts email content, sends it to a backend service, and inserts a generated response into the reply box.

---

## 🔥 Features

* ✨ Injects **AI Reply button** inside Gmail interface
* 📩 Extracts email content using **DOM manipulation**
* 🤖 Generates replies using **AI (via backend API)**
* ⚡ Automatically inserts reply into Gmail compose box
* 🎯 Supports professional tone generation

---

## 🛠️ Tech Stack

### 🔹 Frontend (Extension)

* JavaScript (DOM Manipulation)
* Chrome Extension APIs

### 🔹 Backend

* Spring Boot (Java)
* REST API
* AI Integration ( Gemini)

---

## ⚙️ System Architecture

```
Chrome Extension (Gmail UI)
        ↓
Extract Email Content (DOM)
        ↓
Send Request (Fetch API)
        ↓
Spring Boot Backend (Render)
        ↓
AI API (Generate Response)
        ↓
Send Back Response
        ↓
Inject Reply into Gmail
```

---

## 📂 Project Structure

```
📁 extension/
 ├── manifest.json
 ├── content.js


📁 backend/
 ├── src/main/java/...
 ├── controller/
 ├── service/
 ├── application.properties
 ├── pom.xml
```

---

## 🚀 How to Run Locally

### 🔹 1. Backend (Spring Boot)

```bash
mvn clean install
mvn spring-boot:run
```

Backend runs on:

```
http://localhost:8080
```

---

### 🔹 2. Chrome Extension

1. Open Chrome
2. Go to: `chrome://extensions/`
3. Enable **Developer Mode**
4. Click **Load Unpacked**
5. Select `extension/` folder

---

## 🔌 API Endpoint

### POST `/generate`

#### Request Body:

```json
{
  "emailContent": "Your email text here",
  "tone": "professional"
}
```

#### Response:

```json
{
  "reply": "Generated AI response"
}
```

### 🔹 Extension

* Can be loaded locally
* Can be published to Chrome Web Store

---

## 💡 Key Learnings

* DOM manipulation in real-world apps (Gmail)
* Chrome Extension development
* REST API integration
* Full-stack AI application design

---

## 👨‍💻 Author

**Sumant**
Final Year B.Tech (Computer Science)

---

## ⭐ Acknowledgment

This project demonstrates practical integration of frontend, backend, and AI to solve real-world communication problems.
