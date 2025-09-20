# Spring Boot Learning Journey

This repository documents my hands-on learning path in Spring Boot and Spring Data JPA.  
Each folder represents a specific concept or module I practised, with demonstrations and examples.

## Topics Covered

- **Spring_Basics**  
  Introduction to Spring Boot fundamentals and basic concepts.

- **StereoType_Annotations**  
  Implemented REST APIs using Spring stereotype annotations.

- **SpringData_JPA**  
  Practised JPA annotations and integrated with the H2 database.

- **JPA Query Methods**  
  Demonstrated Spring Data JPA query methods and their integration with the H2 database.

- **JPQL**  
  Learned and practised writing custom queries using JPQL and the `@Query` annotation for flexible data retrieval and manipulation.

- **DTO Classes**  
  Gained hands-on experience with Data Transfer Object (DTO) classes in Spring Boot, using custom queries to map and retrieve only the required data.

- **Criteria API Queries**  
  Gained hands-on experience with Criteria API queries using the `@PersistenceContext` annotation by building custom queries dynamically.

## Requirements

- **IDE**: Eclipse  
- **Database**: H2 (in-memory)  
- **Persistence**: JPA Annotations  

## How to Organise Files

While this is a learning repository and not a full-fledged project, if you want to try out the code:

- Place **entities/models** inside a `model` or `entity` package.  
- Place **repository interfaces** (JPA repositories) inside a `repository` package.  
- Place **service classes** inside a `service` package.  
- Place **controller classes** (if you create REST endpoints) inside a `controller` package.  
- Place **DTO classes** inside a `dto` package to clearly separate data transfer objects from entities.  

This mirrors the common Spring Boot structure and makes it easier to run and understand the code when practising.

---

📌 This repository is not a project, but a structured **learning journey** to track and document my progress in Spring Boot and Spring Data JPA.
