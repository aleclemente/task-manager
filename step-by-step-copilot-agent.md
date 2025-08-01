# Step-by-Step Guide: Creating the Project with GitHub Copilot Agent Mode

This guide provides step-by-step prompts to recreate the structure and files of this project using GitHub Copilot in Agent mode. Each step includes example prompts you can use directly in the Agent.

---

## Steps

### 1. Add Dependencies

Prompt in Agent (Preview):

```
@workspace add in build.gradle dependences: liquibase-core, mysql-connector, lombok
add lombok annotationProcessor
```

---

### 2. Create Packages

Prompt in Agent (Preview):

```
create folders into br.com.dio:
persistence
persistence/config
persistence/converter
persistence/dao
persistence/entity
persistence/migration
service
ui
dto
exception
```

---

### 3. Create Main Class

Prompt in Agent (Preview):

```
create Main.java in br.com.dio with a main method to start the application
```

---

### 4. Create DTO Classes

Prompt in Agent (Preview):

```
create DTO classes in br.com.dio.dto:
BoardColumnDTO.java
BoardColumnInfoDTO.java
BoardDetailsDTO.java
CardDetailsDTO.java
```

---

### 5. Create Exception Classes

Prompt in Agent (Preview):

```
create exception classes in br.com.dio.exception:
CardBlockedException.java
CardFinishedException.java
EntityNotFoundException.java
```

---

### 6. Create Persistence Layer

Prompt in Agent (Preview):

```
create config class ConnectionConfig.java in br.com.dio.persistence.config for database connection

create converter class OffsetDateTimeConverter.java in br.com.dio.persistence.converter

create DAO classes in br.com.dio.persistence.dao:
BlockDAO.java
BoardColumnDAO.java
BoardDAO.java
CardDAO.java

create entity classes in br.com.dio.persistence.entity:
BlockEntity.java
BoardColumnEntity.java
BoardColumnKindEnum.java
BoardEntity.java
CardEntity.java
```

---

### 7. Create Migration Strategy

Prompt in Agent (Preview):

```
create MigrationStrategy.java in br.com.dio.persistence.migration to handle database migrations
```

---

### 8. Create Service Layer

Prompt in Agent (Preview):

```
create service classes in br.com.dio.service:
BoardColumnQueryService.java
BoardQueryService.java
BoardService.java
CardQueryService.java
CardService.java
```

---

### 9. Create UI Layer

Prompt in Agent (Preview):

```
create UI classes in br.com.dio.ui:
BoardMenu.java
MainMenu.java
```

---

### 10. Create Liquibase Files

Prompt in Agent (Preview):

```
create liquibase.properties in src/main/resources

create db.changelog-master.yml in src/main/resources/db/changelog

create migration SQL files in src/main/resources/db/changelog/migrations:
db.changelog-YYYYMMDDHHMM.sql
```

---

## Tips

- Use the exact package structure as shown in the prompts.
- For each class, specify its purpose or main methods if needed.
- Use Copilot Agent to generate boilerplate and implementation code as required.

---

By following these prompts step by step, you can recreate the entire project structure and files using GitHub Copilot in Agent mode.

