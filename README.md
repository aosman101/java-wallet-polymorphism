# Java Wallet — Polymorphism Demo

A Java OOP project models a **Wallet** that holds different **Card** types, demonstrating inheritance, method overriding, and polymorphism.

## Contents

- `Card.java` — This is a base class that provides common functionality for cards.
- `IDCard.java` — Enhances the `Card` class by adding a unique ID number.
- `DriverLicense.java` — Enhances the `IDCard` by adding an expiration year and a method called `isExpired()`.
- `tCallingCard.java` — This extends the `Card` functionality by adding a number and a PIN.
- `Wallet.java` — Stores up to two `Card` objects and formats their display. 
- `CardDriver.java` — `main` method: basic demo for `Card` + kicks off wallet test.
- `WalletTester.java` — Builds sample cards and prints `Wallet#formatCards()`.

---

## Why this project?

This is a concise example for students and interview preparation that demonstrates:
- Class hierarchies and **inheritance**
- **Method overriding** (`format()`, `isExpired()`).
- **Polymorphism** (storing heterogeneous `Card` types in `Wallet`).
- Simple driver program structure.

---

## Getting started

### Requirements
- Java 11+ (any modern JDK is fine).

### Layout (recommended)

├─ src/

│ ├─ Card.java

│ ├─ IDCard.java

│ ├─ DriverLicense.java

│ ├─ CallingCard.java

│ ├─ Wallet.java

│ ├─ CardDriver.java

│ └─ WalletTester.java

└─ README.md
