# 📧 Spring Boot Email Sender

This project demonstrates how to send emails using **Spring Boot** and **JavaMailSender**.  
It includes a simple service for sending plain-text emails when the application starts.

---

## 🚀 Features
- Send plain text emails via Gmail (or any SMTP server).
- Trigger email automatically on application startup.
- Configurable SMTP settings via `application.properties`.

---

## 🛠 Tech Stack
- **Java 17+**
- **Spring Boot**
- **Spring Mail (JavaMailSender)**
- **Maven/Gradle**

---

## ⚙️ Setup Instructions

### 1. Clone the repository
```bash
git clone https://github.com/your-username/springboot-email-sender.git
cd springboot-email-sender

Update your src/main/resources/application.properties:
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your-email@gmail.com
spring.mail.password=your-app-password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

run the project
Project Structure
src/main/java/com/emailSender/demo/
│── DemoApplication.java        # Main entry point
│── Service/
│   └── EmailSendService.java   # Service for sending emails

Example output:
Hi Sayan,
This is to notify you that you have successfully created the service.
