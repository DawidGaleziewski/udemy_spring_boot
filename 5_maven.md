Maven
Maven is a project managment tool for applications
Maven is used for build management and dependencies


Originally one of the solution was to download JAR files that we need to the app like Spring Hibernate, Commons Loggings, JSON from their websites and manually add to build path.


## standard directory structure
- ~/pom.xml
- ~/src/main/java - source code
- ~/src/main/resources - config files used by the app
- ~/src/main/webapp - JSP fiels and config files
- target - build directory and artifacts


## POM.xml file
- project object model file
- containst info on: project meta data, dependencies, plug ins

### POMs project coordinates
those idenitify project uniquely

```xml
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.0.5</version>
		<relativePath/> <!-- lookup parent from repository -->
```

## adding dependencies
```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
```

Adding a dependency will require allways group ID and artifact ID. Version is optional.

Adding version is still best practice.

In java world devs will refer to this as GAV (group id, artifact id, version)

This info can be found on http://search.maven.org


## application.properties
we can add properties here like server.port
We can also configure here props that can be used later in code

ie:
```java
coach.name=Mickey Mouse
```

```java
@Value("${coach.name}") // injecting property
```


## Starters
spring boot team offers selected list of starters which are packages of dependencies for certain projects, i.e mvc projects.

We can use those to have a complete package of dependencies for our priject.
to see what is in dependencies we can go in intellij to view-> tool windows -> maven and we will have a window with our dependencies opened


