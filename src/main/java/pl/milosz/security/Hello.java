package pl.milosz.security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHello() {
       return "hello!";
    }
    @GetMapping("/helloAdmin")
    public String sayHelloToAdmin() {
       return "hello Admin!";
    }
}
