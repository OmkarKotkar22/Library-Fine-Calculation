# 📚 Library Fine Calculation System (Java)

![Language](https://img.shields.io/badge/Language-Java-orange?logo=openjdk)
![Concepts](https://img.shields.io/badge/Concepts-OOP%20%7C%20Abstraction%20%7C%20Interface-blue)
![Features](https://img.shields.io/badge/Features-Fine%20Calculation-purple)
![Status](https://img.shields.io/badge/Status-Complated-success)
![Application](https://img.shields.io/badge/Application-Library%20Management-skyblue)

---

## 📌 Project Overview

The **Library Fine Calculation System** is a **Core Java console-based application** designed to calculate fines for different types of library materials such as **Books**, **Magazines**, and **Research Papers**.

This project is built using **Object-Oriented Programming (OOP)** principles and demonstrates **Abstraction and Interface implementation**, ensuring clean design, flexibility, and real-world applicability.

---

## 🏫 Real-World Use Case (Library System)

In real libraries (college, public, or research libraries), different materials follow **different fine rules**:

- 📕 **Books** → Standard fine per day
- 📰 **Magazines** → Higher fine (shorter borrowing period)
- 📄 **Research Papers** → Strict fine due to limited copies

This project models the **same real-life fine calculation logic** used in actual library systems.

📘 **Reference (Real Library Policy):**  
IFLA – International Federation of Library Associations  
https://www.ifla.org

---

## 📂 Project Structure
```
Library-Fine-Calculation/
│
├── src/
│     └── Library/
│           ├── Book.java
│           ├── Magazine.java
│           ├── ResearchPaper.java
│           ├── FineCalculator.java
│           ├── FineSystem.java
│
├── bin/
│     └── Library/
│           ├── Book.class
│           ├── Magazine.class
│           ├── ResearchPaper.class
│           ├── FineCalculator.class
│           ├── FineSystem.class
│
├── .classpath
└── .project
```

---

## 🧠 Core Java Concepts Used

### ✅ Object-Oriented Programming (OOP)
- Encapsulation
- Inheritance
- Polymorphism
- Method Overriding

### ✅ Abstraction
- Common fine-related behavior is abstracted
- Users interact with **what the system does**, not **how it works internally**
- Reduces complexity and improves maintainability

### ✅ Interface
- A common interface defines the fine calculation contract
- Multiple library items implement their own fine logic
- Ensures consistency across different material types

📗 **Official Source:**  
Oracle Java Documentation – Abstraction & Interface  
https://docs.oracle.com/javase/tutorial/java/IandI/

---

## 🔑 Class-wise Explanation

### 📘 FineCalculator.java (Interface)
- Defines the fine calculation method
- Acts as a contract for all library materials
- Promotes loose coupling

### 📕 Book.java
- Implements `FineCalculator`
- Calculates fine based on book rules

### 📰 Magazine.java
- Implements `FineCalculator`
- Applies higher fine due to short circulation

### 📄 ResearchPaper.java
- Implements `FineCalculator`
- Uses strict fine policy

### 🖥️ FineSystem.java
- Main driver class
- Demonstrates **polymorphism**
- Handles execution flow and output

---

## ⚙️ Features

- ✔ Fine calculation based on item type
- ✔ Interface-driven design
- ✔ Abstraction for simplified usage
- ✔ Clean package structure
- ✔ Easy to extend with new materials
- ✔ Real-world logic simulation

---

## ▶️ How to Run the Project

1. Open project in **Eclipse / IntelliJ IDEA**
2. Ensure Java is installed
3. Navigate to:
`
src/Library/FineSystem.java
`
4. Run as **Java Application**

---

## 🎯 Learning Outcomes

- Strong understanding of **Abstraction vs Interface**
- Practical application of **OOP concepts**
- Real-world system modeling using Java
- Industry-style project structure

---

## 🔮 Future Enhancements

- Add user input for days overdue
- Maintain fine records using files or database
- Add GUI using Java Swing or JavaFX
- Introduce user roles (Student / Staff)

---

## 🏁 Project Status

✔ First Commit Completed  
✔ Fully Functional  
✔ Academic & Practice Ready  

---

## 👨‍💻 Author

**Omkar Kotkar**  
Core Java | OOP | Abstraction | Interface  

---

## 📜 License

This project is intended for **educational and academic use only**.
