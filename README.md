# 🔐 Login Form

A simple, responsive login form built using Spring Boot REST API with a responsive UI built in HTML, CSS, and JavaScript. Used PostgreSQL as backend database.. This form is designed for use in authentication pages, portfolios, or front-end UI demos.

---

## 📁 Project Structure
```
miniauthapp/
├── src/
│   └── main/
│       ├── java/com/example/miniauthapp/
│       │   ├── controller/
│       │   │   └── AuthController.java
│       │   ├── model/
│       │   │   └── User.java
│       │   ├── repository/
│       │   │   └── UserRepository.java
│       │   ├── service/
│       │   │   └── UserService.java
│       │   └── MiniauthappApplication.java
│       └── resources/
│           └── application.properties
├── frontend/
│   └── index.html (includes all CSS and JS)
└── README.md
```

## 🚀 Features

- Responsive layout for desktop and mobile
- Input validation using JavaScript
- Eye icon to toggle password visibility
- Smooth transitions and UI effects
- Clean and modern UI using CSS Flexbox/Grid

---

## ▶ How to Run the Project

### 🧩 Step 1: Backend (Spring Boot + PostgreSQL)

1. Clone the repository:
bash
git clone https://github.com/PriyankaPhadatare/Login-Form
cd Login-Form 


2. Set up your PostgreSQL database:
   - Create a database: miniauthdb
   
3. Run the Spring Boot Application:
bash
./mvnw spring-boot:run

   OR run it from *Eclipse STS* as Spring Boot App

---
### 🌐 Step 2: Frontend (HTML + CSS + JS)

1. Open a terminal inside the frontend/ folder (where your index.html is located)

2. Run the Python HTTP server:
bash
python -m http.server 3000


3. Open your browser and go to:

http://localhost:3434


##🛢️ Database Configuration
 
-

## 🛠️ Tech Stack

| Layer        | Tech                      |
|--------------|---------------------------|
| Frontend     | HTML, CSS, JavaScript     |
| Backend      | Spring Boot (REST API)    |
| Database     | PostgreSQL                |
| Architecture | MVC                       |

---

## 📸 Tested Using Postman

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/036b6a7d-52b9-4d67-ad87-d715a6c085e9" />

## 📸Frontend Output

<img width="1331" height="627" alt="image" src="https://github.com/user-attachments/assets/4fec9d10-49b6-4406-a420-a2fae2d05cb9" />

## 👩‍💻 Author

Name:-   
*Priyanka Phadatare*  
Email:-  
priyankaphadatare162@gmail.com  
Github :-    
https://github.com/PriyankaPhadatare




