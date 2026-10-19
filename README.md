# 🔐 Secure Data Exchange Protocol

A Java-based university graduation project exploring secure data exchange between client and server applications using cryptographic algorithms, digital signatures, data integrity concepts, and TCP/IP communication.

## 📌 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies](#technologies)
- [Cryptographic Algorithms](#cryptographic-algorithms)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Security Disclaimer](#security-disclaimer)
- [Author](#author)

## 📖 Overview

This project was developed as a university graduation project to explore the principles of secure communication and cryptographic operations in a client-server environment.

It combines a Java-based graphical interface with networking functionality and cryptographic components to demonstrate concepts related to confidentiality, data integrity, and digital signatures.

## ✨ Features

- **Client-Server Communication:** Communication between client and server using TCP/IP.
- **Cryptographic Operations:** Demonstrations of cryptographic algorithms implemented in the project.
- **Data Integrity:** Exploration of mechanisms for checking whether data has been modified.
- **Digital Signatures:** Demonstration of digital signature concepts.
- **Graphical User Interface:** A graphical interface for interacting with the application.

## 🛠️ Technologies

| Technology | Purpose |
|---|---|
| Java | Application development |
| TCP/IP | Client-server communication |
| Java Swing GUI framework | User interface |
| RSA | Public-key cryptography |
| ElGamal | Public-key cryptography |
| Serpent | Symmetric-key encryption |
| MD5 | Hashing demonstration |

## 🔑 Cryptographic Algorithms

The project explores the following algorithms:

- **RSA:** A public-key cryptographic algorithm.
- **ElGamal:** A public-key cryptographic scheme.
- **Serpent:** A symmetric-key block cipher.
- **MD5:** A hash function included for educational demonstration.

> Note: MD5 is a hashing algorithm, not an encryption algorithm. It is considered cryptographically broken for collision-resistant applications and should not be used for modern security-sensitive integrity verification.

The actual role and configuration of each algorithm depend on its implementation in the source code.

## 📂 Project Structure

The repository contains the Java source code and project configuration files.

```text
Secure-Data-Exchange-Protocol/
├── src/
│   └── allint/
│       ├── Allint.java
│       ├── ELGAMAL.java
│       ├── MD5.java
│       ├── SERSA.java
│       ├── TCP.java
│       ├── TcpClient.java
│       └── TcpServer.java
├── nbproject/
├── build.xml
├── .gitignore
└── README.md
```

*The structure above highlights selected files; other source files may also be present.*

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) compatible with the project configuration.
- Apache Ant or a compatible build environment if required by the project.
- NetBeans IDE is recommended because the repository contains NetBeans project configuration files.

### Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/EsRaaAlmajeed/Secure-Data-Exchange-Protocol.git
   ```

2. Open the project in NetBeans IDE.

3. Configure a compatible JDK for the project.

4. Build and run the application using the IDE.

*The exact Java version and runtime configuration should be confirmed against the project settings.*

## 🔒 Security Disclaimer

This project was created for educational purposes as a university graduation project. It has not been independently audited for security and should not be considered production-ready.

Do not use it to protect sensitive data without a thorough security review and appropriate modernization of its cryptographic components.

## 👩‍💻 Author

**Esraa Al-abd Al-Majeed**

- GitHub: [@EsRaaAlmajeed](https://github.com/EsRaaAlmajeed)

---

*Developed as a university graduation project in Informatics Engineering.*
