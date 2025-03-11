# PetTracker 🐾

![PetTracker Logo](https://via.placeholder.com/150)

PetTracker es un proyecto que combina una aplicación web y una API REST diseñadas para gestionar el bienestar de mascotas. La web, construida con **Spring Boot** y **Thymeleaf**, consume la API REST incluida en este repositorio para ofrecer una solución integral y segura.

## Características principales
- **Gestión de Mascotas**: Crea y edita perfiles con detalles como nombre, especie, género, peso y URL de imagen.
- **Vacunas**: Administra el historial de vacunas.
- **Reportes Médicos**: Registra visitas al veterinario y vincula prescripciones.
- **Ejercicio Físico**: Controla las actividades físicas de las mascotas.
- **Seguridad**: Autenticación y autorización mediante JWT (Bearer Token).
- **Interfaz Dinámica**: Formularios editables en la web con Thymeleaf y JavaScript.

## Tecnologías utilizadas
- **API REST**: Spring Boot, Spring Data JPA, RESTful endpoints
- **Web**: Spring Boot, Thymeleaf, Bootstrap 5, JavaScript
- **Seguridad**: Spring Security, JWT
- **Dependencias**: RestTemplate, Jackson, H2/MySQL (configurable)

## Requisitos previos
- Java 21+
- Maven
- Base de datos (Oracle por defecto, configurable a H2 para pruebas)
- Configuración de JWT (clave secreta en `application.properties`)
- Cambios en application-secret.properties (DataSource, Username, Password, Driver)
- Coloca tu clave secreta en `jwt-secret.txt`

## Instalación
1. Clona el repositorio:
   ```bash
   git clone https://github.com/[tu-usuario]/PetTracker.git
   ```
2. Navega al directorio raíz:
   ```bash
   cd PetTracker
   ```

### Ejecutar la API
3. Entra en el directorio de la API:
   ```bash
   cd pettracker-api
   ```
4. Configura la base de datos y JWT en `pettracker-api/src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:h2:mem:pettracker
   spring.datasource.username=sa
   spring.datasource.password=
   jwt.secret=tu-clave-secreta
   ```
5. Compila y ejecuta la API:
   ```bash
   mvn spring-boot:run
   ```

### Ejecutar la Web
6. En una nueva terminal, entra en el directorio de la web:
   ```bash
   cd pettracker-web
   ```
7. Configura la URL de la API en `pettracker-web/src/main/resources/application.properties`:
   ```properties
   api.base.url=http://localhost:8080/api
   ```
8. Compila y ejecuta la web:
   ```bash
   mvn spring-boot:run
   ```
9. Abre tu navegador en `http://localhost:9000`.

## Contribuciones
¡Feedback y pull requests son bienvenidos! Si quieres mejorar la API, añadir funciones a la web (como subida de imágenes) o reportar errores, abre un issue.

## Créditos
Desarrollado por DanielPM.dev como proyecto final de asignatura de AD y PMDM. La app móvil complementaria fue creada por dos compañeros de clase.

Happy coding! 🚀  
#SpringBoot #Thymeleaf #API #PetTracker #Mascotas
```

---

### Instrucciones para Usar:
1. **Descripción**: Copia y pega la descripción en la sección "About" de tu repositorio en GitHub (ajusta `[tu-usuario]` por tu nombre de usuario).
2. **README.md**:
   - Crea un archivo llamado `README.md` en la raíz de tu repositorio.
   - Copia todo el bloque de texto anterior y pégalo en el archivo.
   - Personaliza `[tu-usuario]`, `[Tu Nombre]`, y cualquier configuración específica (como la base de datos o la clave JWT).
   - Si tienes un logo o capturas, reemplaza `https://via.placeholder.com/150`.

Si prefieres que te lo dé como un archivo descargable, puedo subirlo a algún servicio como Gist y darte el enlace, pero este formato debería ser fácil de copiar y usar directamente. ¿Necesitas algo más o quieres ajustar algo?
