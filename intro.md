# Prerequisites
JDK (JDK 17 or higher for Spring Boot 3)

# Spring
- popular Java framework
- provides a lot of helper clases and annotations
- building a pure sring application can be hard as we need to decide: what JAR dependencies do we need? What config to use (XML or JAVA)? How to install Tomact, JBoss etc.


# Spring boot
- makes it easier to get start. 
- will perform auto-config based on props files and JAR classpath
- helps to resolve dependency conflicts (Maven or Gradle)
- provides a HTTP server
- Spring boot app is a self contained unit! We do not have to configure tomcat on our own
- Deploying can be done by traditional way by WAR file to an external server. 

Spring Boot uses Spring behind the scenes. 
Spring provides a starter Spring Boot project at http://start.spring.io

Spring boot is mostly about configuration. Spring boot uses Spring MVC under the hood

# Spring initializer
https://start.spring.io

- Create starter spring project
- creates a Maven/Gradle project that we can download as a ZIP
- import the project into IDE

Dependencies: Spring Web: complete package of dependencies containing things like Spring MVC, RESTful and Apache Tomcat


# Maven
- we tell maven about projecs we are working with (dependencies) i.e Spring or Hibernate
- Maven downloads JAR files for those projects
