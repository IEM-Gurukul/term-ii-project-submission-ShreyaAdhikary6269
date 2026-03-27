[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project


## Project Title
Mini Banking System using Layered Architecture (Service + Repository)

---

## Problem Statement (max 150 words)
The project aims to develop a mini banking system that simulates basic banking operations such as account creation, login, deposit, withdrawal, and balance enquiry. Traditional banking operations require secure handling of user data and transactions, which this system attempts to replicate in a simplified manner. The system ensures data persistence using a database and provides a user-friendly interface for interaction. It also focuses on maintaining modularity and separation of concerns using layered architecture.

---

## Target User
Bank Customers: To perform daily banking operations like deposit, withdrawal, and balance enquiry
- New Users: To create accounts using the signup feature
- Bank Staff (Simulation): To test and manage user transactions
- Developers: To understand layered architecture and database integration
- Students/Learners: To study Java OOP concepts and real-world application design

---

## Core Features
- Secure User Signup with multi-step form (Signup1, Signup2, Signup3)
- Login Authentication using PIN verification
- Deposit Money into account
- Withdraw Money with validation checks
- Fast Cash feature for quick withdrawal
- Balance Enquiry to check current account balance
- Transaction history stored in database (H2)
- GUI-based interface using Java Swing
- Modular design using layered architecture (Service + Repository)





---

## OOP Concepts Used

- Abstraction:
  The system hides complex database operations and business logic behind service classes, exposing only necessary methods to the UI layer. This simplifies interaction and improves code readability.

- Inheritance:
  Common functionalities across different UI screens (like Login, Signup, Transactions) are reused through inheritance, reducing code duplication and improving maintainability.

- Polymorphism:
  Method overriding is used to define different behaviors for similar operations (e.g., transaction handling), allowing flexibility and scalability in the system.

- Encapsulation:
  Data such as user details and transaction information are wrapped inside classes, restricting direct access and ensuring controlled modification through methods.

- Exception Handling:
  Used to handle runtime errors such as invalid inputs, database connection failures, and transaction errors, ensuring the system does not crash and provides meaningful feedback.

- Collections:
  Java Collections are used to manage and manipulate data efficiently where required (e.g., temporary storage, processing lists of transactions).

---

## Proposed Architecture Description

---

## How to Run

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
