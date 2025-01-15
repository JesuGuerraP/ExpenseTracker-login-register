# ExpenseTracker

![Status](https://img.shields.io/badge/Status-En%20Desarrollo-blue)
![License](https://img.shields.io/badge/Licencia-MIT-green)

**ExpenseTracker** es una aplicación web desarrollada con Spring Boot que permite gestionar los gastos personales de forma intuitiva y eficiente. Proporciona una interfaz amigable con Thymeleaf para que los usuarios puedan agregar, visualizar, actualizar y eliminar sus gastos. También incluye funcionalidades de inicio de sesión, registro y autenticación para proteger la información personal de los usuarios.

---

## 🚀 Características

- **Gestión de Gastos**:
  - Agregar nuevos gastos con descripción, monto y fecha.
  - Ver una lista detallada de todos los gastos registrados.
  - Editar o eliminar gastos existentes.
- **Inicio de Sesión y Registro**:
  - Registro de nuevos usuarios con credenciales únicas.
  - Autenticación segura para acceder a las funcionalidades de la aplicación.
  - Manejo de roles y permisos (en desarrollo).
- **Interfaz Dinámica**: Renderizado de vistas responsivas y dinámicas utilizando Thymeleaf.
- **Persistencia de Datos**: Almacenamiento de datos en una base de datos MySQL mediante JPA/Hibernate.
- **Validación de Entradas**: Validación en el lado del servidor para garantizar la calidad y consistencia de los datos.
- **Manejo de Errores**: Gestión de errores comunes como entradas inválidas o problemas de conexión con la base de datos.

---

## 🛠 Tecnologías Utilizadas

### Backend
- **Java 17**: Lenguaje principal para la lógica de negocio.
- **Spring Boot**: Framework para el desarrollo de aplicaciones web:
  - **Spring MVC**: Gestión de controladores y enrutamiento.
  - **Spring Data JPA**: Para la interacción con la base de datos.
  - **Spring Security**: Implementación de autenticación y autorización.
  - **Spring Boot DevTools**: Para recarga en caliente durante el desarrollo.

### Frontend
- **Thymeleaf**: Motor de plantillas para renderizar vistas dinámicas.
- **Bootstrap**: Framework CSS para diseño responsivo y moderno.
- **HTML5 y CSS3**: Construcción y estilización de las vistas.

### Base de Datos
- **MySQL**: Base de datos relacional para el almacenamiento de los gastos y datos de usuario.

### Herramientas
- **Maven**: Gestión de dependencias y construcción del proyecto.
- **IntelliJ IDEA**: Entorno de desarrollo integrado.
- **Postman**: Pruebas de las rutas REST del backend.

---

## 📦 Instalación y Configuración

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/JesuGuerraP/ExpenseTracker.git
