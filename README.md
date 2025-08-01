# Task Manager

A simple Java-based task management application with a command-line interface. This project demonstrates a modular architecture using DAOs, DTOs, services, and a migration strategy for database management.

## Features
- Manage boards, columns, and cards
- Block and finish cards
- Query board and card details
- Database migrations with Liquibase
- Modular code structure (DAO, DTO, Service, UI)

## Technologies Used
- Java
- Gradle
- Liquibase
- H2 (or other JDBC-compatible DB)

## Project Structure
```
src/main/java/com/clemente/
  dto/         # Data Transfer Objects
  exception/   # Custom exceptions
  persistence/ # Database config, DAOs, entities, migrations
  service/     # Business logic
  ui/          # Command-line menus
resources/
  liquibase.properties
  db/changelog/
    db.changelog-master.yml
    migrations/
      *.sql
```

## Getting Started

### Prerequisites
- Java 17 or higher
- Gradle 7+

### Build and Run
```bash
./gradlew build
./gradlew run
```

### Database Migrations
Liquibase is used for managing database schema changes. Migrations are located in `src/main/resources/db/changelog/migrations/`.

## Usage
The application runs in the terminal and provides interactive menus to manage boards, columns, and cards.

## Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](LICENSE)

