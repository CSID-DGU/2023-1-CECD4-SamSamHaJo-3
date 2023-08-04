package samsamhajyo.Backend.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "Hello, world";
    }
    @GetMapping("/health")
    public String test1(){
        return "200";
    }

}
