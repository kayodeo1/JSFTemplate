
# 🚀 Updated README for Apache TomEE Plume 10

This version ensures that your JSF 4.0 + PrimeFaces 14 template works specifically on TomEE 10.

## 🔥 JSF 4.0 + PrimeFaces 14 on Apache TomEE 10

A Starter Project for Enterprise Web Apps with Jakarta EE 10, PrimeFaces, and Apache TomEE Plume 10

## 📌 About This Project

This is a fully configured Java EE 10 template for building modern web applications using:

- Apache TomEE Plume 10
- Jakarta EE 10 (Servlet 6.0, CDI, JSF 4.0)
- PrimeFaces 14 for UI Components
- Maven for dependency management
- Java 17+ for modern compatibility

🚀 Clone this project and start building enterprise Java applications instantly!

## 📂 Project Structure

jsf-helloworld/
├── src/main/java/com/example/ # Java source files (Managed Beans, Config)<br>
│ ├── HelloWorld.java # Sample JSF Managed Bean<br>
│ ├── FacesServletConfig.java # Registers FacesServlet for JSF<br>
├── src/main/webapp/ # Web resources (XHTML, CSS, JS)<br>
│ ├── index.xhtml # Main JSF page (PrimeFaces dialog example)<br>
│ ├── resources/css/ # Custom CSS (optional)<br>
│ ├── WEB-INF/<br>
│ │ ├── beans.xml # Enables CDI (Contexts and Dependency Injection)<br>
│ │ ├── faces-config.xml # JSF Configuration (optional)<br>
├── pom.xml # Maven dependencies and plugins<br>
├── .gitignore # Git ignore rules<br>
└── README.md # You’re reading this right now 😏<br>



## 🔧 Setup & Installation

### 1️⃣ Prerequisites

Ensure you have:

- Java 17+ installed (`java -version`)
- Maven installed (`mvn -version`)
- Apache TomEE 10 Plume (or newer)

### 2️⃣ Clone the Repository

git clone https://github.com/your-username/jsf-helloworld.git
cd jsf-helloworld



### 3️⃣ Build the Project

mvn clean package



### 4️⃣ Deploy to Apache TomEE 10

Start TomEE:

$TOMEE_HOME/bin/startup.sh



Copy the WAR file to the `webapps/` folder:

cp target/jsf-helloworld.war $TOMEE_HOME/webapps/



Check the TomEE logs to ensure deployment is successful:

tail -f $TOMEE_HOME/logs/catalina.out



### 5️⃣ Access the Application

Open your browser and go to:

http://localhost:8080/jsf-helloworld/index.xhtml



## 🔥 Features

- ✔ Pre-configured JSF 4.0 Environment
- ✔ PrimeFaces 14 Dialog Example
- ✔ CDI-Enabled Managed Bean
- ✔ Maven-Based Build System
- ✔ Compatible with Apache TomEE 10 Plume

## 💡 How to Customize

- **Change the theme:** Modify `WEB-INF/web.xml`

<context-param> <param-name>primefaces.THEME</param-name> <param-value>lara-light-blue</param-value> </context-param> ```
Modify UI Components: Edit index.xhtml

Add More Managed Beans: Create more classes in com.example

📜 License
This project is open-source and free to use. Feel free to fork, modify, and contribute!

🚀 Now go forth and build awesome Java EE apps on TomEE 10! 😎🔥