# Spring Boot JWT Authentication

## Introduction
This project demonstrates how to implement JWT (JSON Web Token) authentication in a Spring Boot application. It includes user registration, login, and token-based authentication.

## Features
- User authentication with JWT
- Secure API endpoints
- Role-based access control
- Refresh token mechanism
- Spring Security integration

## Getting Started
### Prerequisites
Before running the application, make sure you have:
- Java 17+
- Maven
- PostgreSQL or MySQL (or use H2 for in-memory database)

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/fajarabdillah354/springboot-demo-JWT.git
   cd springboot-demo-JWT
   ```
2. Configure application properties:
    - Set up database and JWT settings in `application.yml`:
      ```yaml
      spring:
        datasource:
          url: jdbc:postgresql://localhost:5432/your_database
          username: your_username
          password: your_password
        security:
          jwt:
            secret: YOUR_SECRET_KEY
            expirationMs: 3600000
      ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
- `POST /api/auth/register` - Register a new user
- `POST /api/auth/login` - Authenticate and receive a JWT token
- `GET /api/user/me` - Get current authenticated user details
- `POST /api/auth/refresh` - Refresh JWT token

## Usage
1. Register a new user via `POST /api/auth/register`
2. Authenticate and obtain a JWT via `POST /api/auth/login`
3. Use the token to access secured endpoints by adding it to the `Authorization` header

## Technologies Used
- Spring Boot
- Spring Security
- JSON Web Token (JWT)
- PostgreSQL/MySQL/H2

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author
Developed by [Fajar Abdillah](https://github.com/fajarabdillah354)



