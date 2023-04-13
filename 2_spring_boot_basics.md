# Rest controller

To create rest conteoller we use annotation @RestController
When we map a certain path we use @GetMapping("/path") annotation


```java
@RestController
public class FunRestController {
    // expose "/" endpoint returning hello world
    @GetMapping("/")
    public  String sayHello(){
        return "Hello World!";
    }
}

```
