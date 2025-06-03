# 🐾 PetTracker – Tu App para el Bienestar de Mascotas

**PetTracker** es una plataforma compuesta por una **API REST** y una **aplicación web** para gestionar la salud y el bienestar de tus mascotas. Desarrollado con **Spring Boot** y **Thymeleaf**, ofrece funcionalidades completas con autenticación segura y una interfaz intuitiva.

---

## ✨ Características Principales

- 🔹 **Gestión de Mascotas**: Registra nombre, especie, peso, género y foto.  
- 💉 **Historial de Vacunas**: Añade y consulta vacunas aplicadas.  
- 🩺 **Reportes Médicos**: Guarda visitas y diagnósticos del veterinario.  
- 🏃‍♂️ **Seguimiento de Ejercicio**: Monitorea la actividad física.  
- 🔒 **Seguridad JWT**: Autenticación y autorización vía **Bearer Token**.  
- 🌐 **Interfaz Web Dinámica**: Formularios interactivos con **Thymeleaf y JavaScript**.

---

## 🛠️ Tecnologías Utilizadas

| Backend (API REST) | Frontend (Web) | Seguridad | Persistencia |
|--------------------|----------------|-----------|--------------|
| Spring Boot        | Thymeleaf      | Spring Security + JWT | Spring Data JPA |
| REST Controllers   | Bootstrap 5    |           | Oracle   |
| Jackson, RestTemplate | JavaScript |           |              |

---

## 📦 Requisitos Previos

- ☕ **Java 21+**
- 🧰 **Maven**
- 🗄️ **Base de datos**: Oracle (por defecto) o H2 (modo desarrollo)
- 🔐 Archivo `jwt-secret.txt` con la clave secreta
- 🧾 Archivo `application-secret.properties` con configuración sensible (DB, credenciales...)

---

## 📁 Estructura del Proyecto

```bash
PetTracker/
├── pettracker-api/      # API REST
├── pettracker-web/      # Aplicación Web con Thymeleaf
```

---

## ⚙️ Configuración Inicial

### 1️⃣ Clonar el Repositorio

```bash
git clone --depth 1 https://github.com/DanielPMdev/PetTracker.git
cd PetTracker
```

---

### 2️⃣ Crear archivos de configuración requeridos

#### 📄 `application-secret.properties`

Ubicación:  
`pettracker-api/src/main/resources/application-secret.properties`

Contenido de ejemplo:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
```

✅ **Modo alternativo (H2)** para pruebas:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
```

#### 🔐 `jwt-secret.txt`

Ubicación esperada:  
`pettracker-api/src/main/resources/jwt-secret.txt`

Contenido:
```
mi-clave-super-secreta
```

---

## 🚀 Ejecución del Proyecto

### 🧩 1. Ejecutar la API

```bash
cd pettracker-api
```

#### 🛠️ Editar `application.properties`

Archivo:  
`src/main/resources/application.properties`

Ejemplo:

```properties
spring.config.import=application-secret.properties

jwt.secret-file=classpath:jwt-secret.txt

server.port=8080
```

▶️ Ejecutar la API:

```bash
mvn spring-boot:run
```

API disponible en:  
`http://localhost:8080/api`

---

### 🌐 2. Ejecutar la Aplicación Web

```bash
cd ../pettracker-web
```

#### 🛠️ Editar `application.properties`

Archivo:  
`src/main/resources/application.properties`

Ejemplo:

```properties
api.base.url=http://localhost:8080/api
server.port=9000
```

▶️ Ejecutar la Web:

```bash
mvn spring-boot:run
```

Abre tu navegador en:  
`http://localhost:9000`

---

## 🧪 Pruebas Rápidas

- Puedes usar H2 para un entorno sin base de datos externa. Accede a la consola en:  
  `http://localhost:8080/h2-console`  
  (si habilitaste `spring.h2.console.enabled=true`)

---

## 🤝 Contribuciones

¡Tu feedback y contribuciones son bienvenidos!  
Puedes:

- Sugerir mejoras o nuevas funcionalidades (por ejemplo: subida de imágenes)
- Reportar errores abriendo un **Issue**
- Enviar un **Pull Request**

---

## 🏆 Créditos

- 💡 Desarrollado por [DanielPM.dev](https://github.com/DanielPMdev)  
- 🎓 Proyecto final de las asignaturas **Acceso a Datos (AD)** y **Programación Multimedia y Dispositivos Móviles (PMDM)**  
- 📱 La app móvil complementaria fue desarrollada por compañeros de clase.

---

## 📌 Etiquetas

`#SpringBoot` `#Thymeleaf` `#API` `#PetTracker` `#Mascotas`
