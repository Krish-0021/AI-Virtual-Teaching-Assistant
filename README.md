# AI-Virtual-Teaching-Assistant
Java-based Virtual Teaching Assistant with Swing UI, MySQL integration, and academic reminder system.
🤖 AI-Powered Virtual Teaching Assistant (Java)

A desktop-based academic support chatbot that provides instant responses to student queries, allows teachers to manage FAQs, and includes a reminder system for better study planning. Built using Java Swing, JDBC, and multithreading concepts.

🚀 Features

✔️ 24/7 Academic Query Support
✔️ Automated FAQ Answering from a knowledge base
✔️ Reminder & Notification System using background threads
✔️ Teacher Module to add/update FAQs
✔️ Interactive Chat-style UI built with Java Swing
✔️ Secure user roles – Teacher & Student
✔️ modular, scalable design using OOP principles

🛠️ Tech Stack
Component	            Technology
Programming Language	Java
GUI Framework	        Java Swing
Database	            MySQL
Connectivity	        JDBC
Concurrency	          Java Threads
Architecture Style	  MVC inspired
📌 System Architecture
Main.java
│
├── User.java
├── VirtualAssistant.java
├── DatabaseManager.java
├── Scheduler.java
├── ResponseGenerator.java
└── GUIHandler.java

🧠 Java Concepts Demonstrated

✅ Object-Oriented Programming — modular class structure

✅ Event-Driven Programming — UI reacts to user input

✅ Concurrent Programming — threads handle timed tasks

✅ Declarative Programming — SQL queries for data operations

📂 Database Structure (MySQL)
Table Name	  Purpose
users	        Stores student & teacher login info
faqs	        Stores academic questions & answers
reminders	    Stores student reminder messages & schedule

✔️ Fully integrated via JDBC
✔️ Supports CRUD operations for FAQ management
🏁 How to Run the Project

1️⃣ Install Java JDK 8+
2️⃣ Install MySQL Server & create database teaching_assistant
3️⃣ Import the provided .sql file
4️⃣ Configure database credentials in DatabaseManager.java
5️⃣ Compile & run the Main.java file from IDE or terminal
🔒 User Roles
Role	    Capabilities
Student	  Ask queries, set reminders
Teacher	  Manage and update FAQs in database
🌱 Future Enhancements

Add NLP support for smarter query understanding

Improve UI design with chat bubbles and themes

Deploy as a web app for online accessibility

Add mobile version using Kotlin/React Native

Cloud-host the database for multi-user access

📝 Project Outcome

This project delivers a scalable and intelligent academic assistant using advanced Java features including GUI development, threading, and database integration — demonstrating real-world software engineering skills.

📄 License

This project is licensed under the MIT License — free to modify or use with credits.
