
# HelloSpring

A hands-on project to understand the architecture and core features of Spring Boot


## Tech 

Java 17+                 
Spring Boot 3.x           
Maven         
H2 Database (ou MySQL)         
(Event) Spring Data JDBC, Spring Web, SPring Actuator, etc


## Installation

You need to make sure JAVA 17 (or higher version) and maven is installed on your computer
```bash
  java -version
  mvn --version
```
Only after that you can clone the repository by using the following command :
```bash
git clone https://github.com/IorYohanna/Some_Random_SpringBoot_Project.git
cd Some_Random_SpringBoot_Project
```
you can now open the project in you favorite IDE as VS code and IntelliJ to run 
the project
```bash
mvn spring-boot:run
```
and open it on port: http://localhost:8080 in your browser

## What You'll Learn

• Understanding key Spring concepts:

    • Beans and Application Context
    • Inversion of Control (IoC)
    • Dependency Injection (DI)
    • Spring MVC architecture

• Building a Spring Boot application from scratch


    • Spring MVC for web development
    • Spring Data for database integration

• Creating a REST API with Spring Boot

• Preparing your application for production deployment

## Production 
If you have a JVM or JDK on your computer you can create a .jar file                      
By excecuting the following command (in the terminal) in your main repository :
```bash
./mvw clean package
```
Now you can run the .jar file by writing this command line :
```bash
java -jar your-project-name.jar
```
