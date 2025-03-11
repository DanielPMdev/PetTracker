# 🐾 PetTracker – Tu App para el Bienestar de Mascotas  

PetTracker es una plataforma que combina una **aplicación web** y una **API REST** para gestionar la salud y el bienestar de tus mascotas. Desarrollado con **Spring Boot** y **Thymeleaf**, este proyecto ofrece una solución integral con autenticación segura y una interfaz dinámica.  

## ✨ Características Principales  
🔹 **Gestión de Mascotas**: Crea y edita perfiles con detalles como nombre, especie, género, peso y foto.  
💉 **Historial de Vacunas**: Administra y registra vacunas fácilmente.  
🩺 **Reportes Médicos**: Guarda visitas al veterinario y prescripciones médicas.  
🏃‍♂️ **Seguimiento de Ejercicio**: Controla la actividad física de cada mascota.  
🔒 **Seguridad Avanzada**: Autenticación y autorización mediante **JWT (Bearer Token)**.  
🌐 **Interfaz Dinámica**: Formularios interactivos con **Thymeleaf y JavaScript**.  

## 🛠️ Tecnologías Utilizadas  
🚀 **Backend / API REST**: Spring Boot, Spring Data JPA, RESTful Endpoints.  
🎨 **Frontend / Web**: Thymeleaf, Bootstrap 5, JavaScript.  
🔐 **Seguridad**: Spring Security, JWT.  
📦 **Dependencias**: RestTemplate, Jackson, H2/MySQL (configurable).  

## 📌 Requisitos Previos  
**Java 21+**  
**Maven**  
**Base de Datos** (Oracle por defecto, configurable a H2 para pruebas)  
**Configuración de JWT** (Clave secreta en `application.properties`)  
**Archivo de configuración `application-secret.properties`** (DataSource, Usuario, Contraseña, Driver)  
**Clave secreta en `jwt-secret.txt`**  

## 🚀 Instalación  

### 1️⃣ Clonar el Repositorio  
```bash
git clone --depth 1 https://github.com/DanielPMdev/PetTracker.git
```
```bash
cd PetTracker
```

### 2️⃣ Ejecutar la API  
📁 **Accede al directorio de la API**:  
```bash
cd pettracker-api
```
🛠️ **Configura la base de datos y JWT en** `pettracker-api/src/main/resources/application.properties`:  
```properties
spring.datasource.url=[CONEXION_DB]
spring.datasource.username=[USERNAME]
spring.datasource.password=[PASSWORD]
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

jwt.secret=tu-clave-secreta
```
▶️ **Compila y ejecuta la API**:  
```bash
mvn spring-boot:run
```

### 3️⃣ Ejecutar la Web  
📁 **Accede al directorio de la web**:  
```bash
cd pettracker-web
```
🌍 **Configura la URL de la API en** `pettracker-web/src/main/resources/application.properties`:  
```properties
api.base.url=http://localhost:8080/api
```
▶️ **Compila y ejecuta la web**:  
```bash
mvn spring-boot:run
```
🖥️ **Abre tu navegador en** `http://localhost:9000`  

## 🤝 Contribuciones  
📢 ¡Tu feedback y pull requests son bienvenidos! Puedes contribuir con mejoras en la API, nuevas funcionalidades para la web (como subida de imágenes) o reportando errores. Simplemente abre un **issue** en el repositorio.  

## 🏆 Créditos  
💡 **Desarrollado por** [DanielPM.dev](https://github.com/DanielPMdev) como **proyecto final** en las asignaturas de **Acceso a Datos (AD)** y **Programación Multimedia y Dispositivos Móviles (PMDM)**.  
📱 La aplicación móvil complementaria fue desarrollada por dos compañeros de clase.  

Happy coding! 🚀🐾  

---
**#SpringBoot #Thymeleaf #API #PetTracker #Mascotas**  
---
