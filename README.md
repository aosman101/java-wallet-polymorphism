# JavaWalletPolymorphism
A tiny Java OOP demo: a Wallet holding different Card types (CallingCard, IDCard, DriverLicense) to illustrate inheritance, overriding, and polymorphism.

# Java Wallet — Polymorphism Demo

A tiny Java OOP project that models a **Wallet** holding different **Card** types to demonstrate inheritance, method overriding, and polymorphism.

## Contents

- `two/Card.java` — Base class with common behaviour for cards  
- `two/IDCard.java` — Extends `Card` with an ID number  
- `two/DriverLicense.java` — Extends `IDCard` with an expiration year and `isExpired()`  
- `two/CallingCard.java` — Extends `Card` with number + PIN  
- `two/Wallet.java` — Holds up to two `Card` objects and formats them  
- `two/CardDriver.java` — `main` method: basic demo for `Card` + kicks off wallet test  
- `two/WalletTester.java` — Builds sample cards and prints `Wallet#formatCards()`

---

## Why this project?

It’s a compact example for students/interview-prep that shows:
- Class hierarchies and **inheritance**
- **Method overriding** (`format()`, `isExpired()`)
- **Polymorphism** (storing heterogeneous `Card` types in `Wallet`)
- Simple driver program structure

---

## Getting started

### Requirements
- Java 11+ (any modern JDK is fine)

### Layout (recommended)
