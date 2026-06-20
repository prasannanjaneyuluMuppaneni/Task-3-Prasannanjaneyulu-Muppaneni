# Task-3-Prasannanjaneyulu-Muppaneni
# DecodeLabs Java Project 3 - ATM Simulation System

## Project Description

The ATM Simulation System is a console-based Java application that simulates basic banking operations. The project allows users to interact with a bank account through a simple menu-driven interface. Users can check their account balance, deposit money, withdraw money, and exit the application. The system maintains account information securely and validates transactions to ensure accurate banking operations.

This project is designed to provide hands-on experience with Java programming and Object-Oriented Programming (OOP) concepts. It demonstrates how real-world banking operations can be implemented using classes, objects, methods, and user input handling.

## Features

* Check current account balance
* Deposit money into the account
* Withdraw money from the account
* Prevent invalid deposits and withdrawals
* Display appropriate messages for successful and failed transactions
* Menu-driven user interface
* Secure handling of account balance using encapsulation

## Concepts Used

### 1. Classes and Objects

The project uses a `BankAccount` class to represent a bank account. An object of this class is created in the main program to perform banking operations.

### 2. Encapsulation

The account balance is declared as a private variable, preventing direct access from outside the class. Access is provided through public methods.

```java
private double balance;
```

### 3. Constructor

A constructor is used to initialize the account with a starting balance.

```java
BankAccount account = new BankAccount(500);
```

### 4. Methods

The project uses methods such as:

* `getBalance()` – Returns the current balance.
* `deposit()` – Adds money to the account.
* `withdraw()` – Withdraws money from the account.

### 5. Conditional Statements

`if-else` statements are used to validate deposit and withdrawal amounts and handle insufficient balance situations.

### 6. Looping

A `do-while` loop is used to repeatedly display the menu until the user chooses to exit.

### 7. Switch Case

A `switch` statement is used to perform different operations based on the user's menu selection.

### 8. Scanner Class

The `Scanner` class is used to accept user input from the keyboard.

## Learning Outcomes

Through this project, users can learn:

* Fundamentals of Java programming
* Object-Oriented Programming concepts
* Encapsulation and data security
* Method creation and usage
* User input handling
* Menu-driven program development
* Basic banking transaction logic

## Conclusion

The ATM Simulation System is a beginner-friendly Java project that demonstrates the implementation of essential OOP concepts in a real-world banking scenario. It provides a practical understanding of classes, objects, encapsulation, methods, loops, and user interaction while building a functional banking application.
