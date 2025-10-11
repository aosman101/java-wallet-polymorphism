# Java Wallet — Polymorphism Demo

A Java OOP project that models a **Wallet** holding different **Card** types to demonstrate inheritance, method overriding, and polymorphism.

## Contents

- `Card.java` — Base class with common behaviour for cards.
- `IDCard.java` — Extends `Card` with an ID number.
- `DriverLicense.java` — Extends `IDCard` with an expiration year and `isExpired()`.
- `tCallingCard.java` — Extends `Card` with number + PIN.
- `Wallet.java` — Holds up to two `Card` objects and formats them. 
- `CardDriver.java` — `main` method: basic demo for `Card` + kicks off wallet test.
- `WalletTester.java` — Builds sample cards and prints `Wallet#formatCards()`.

---

## Why this project?

It’s a compact example for students/interview-prep that shows:
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
