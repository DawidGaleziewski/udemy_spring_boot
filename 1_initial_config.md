# stupid shit issues
when you download the project from: https://start.spring.io and open it with intelliJ it will start downloading deps.

When having issues tis workt to click on pom file -> maven -> reload
In some cases there may be errors due to java version or stupid shit.
IntelliJ will show a link to force download the dependencies omitting the stupid shit issue


# starting app
got to src -> main -> java -> AppNameClass and run the app
example of entry point for spring app:

```java
SpringApplication.run(DawidtestappApplication.class, args);
```
