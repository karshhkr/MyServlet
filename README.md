# 🚀 Project: myServlet – Java Web Fundamentals

A robust, beginner-friendly implementation of the **Jakarta Servlet API** designed to demonstrate the core mechanics of server-side Java development. This project serves as a foundational look into how **Apache Tomcat** handles the **HTTP Request-Response cycle**.



## 📌 Project Overview

`myServlet` is a web application that bridges the gap between static HTML interfaces and dynamic Java backend logic. It focuses on the fundamental concepts of Web Containers and how they manage Java classes to process user data.

### 🔑 Key Learning Objectives:
* **Servlet Lifecycle:** Implementing the `init()`, `service()`, and `destroy()` flow.
* **Parameter Extraction:** Handling client-side data using `HttpServletRequest`.
* **Deployment Descriptor:** Manual configuration of `web.xml` for URL mapping.
* **Dynamic Response:** Generating real-time HTML content via `HttpServletResponse`.

---

## 🛠️ Tech Stack

| Layer | Technology |
| :--- | :--- |
| **Language** | Java (JDK 8 or higher) |
| **API** | Jakarta Servlet API |
| **Web Server** | Apache Tomcat 9.0+ |
| **Frontend** | HTML5 |
| **IDE** | Eclipse / IntelliJ IDEA |

---

## 📂 Project Structure

```text
myServlet/
├── src/
│   └── com/karshhkr/
│       └── add.java          # Backend logic & Request Handling
├── WebContent/
│   ├── index.html            # User Interface (Input Form)
│   └── WEB-INF/
│       └── web.xml           # Servlet Mapping & Configuration
└── README.md                 # Project Documentation
