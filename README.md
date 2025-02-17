# Consuming REST services using Spring

### Consuming using OpenFeign

This is a sample project to demo consuming Rest Service that I built before WebSchool App.

This project uses Spring Boot and OpenFeign to consume Rest Service.
OpenFeign is a declarative REST client for Java that simplifies the process of making HTTP requests to external APIs. It abstracts the complexities of writing boilerplate code for REST communication by allowing developers to define an interface and annotate it with Feign-specific annotations.

### How to run

Run `mvn spring-boot:run`

Open http://localhost:8081/getMessages{?status = Open || Close}
