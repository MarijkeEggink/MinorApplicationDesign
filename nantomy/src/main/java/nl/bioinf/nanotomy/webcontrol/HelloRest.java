package nl.bioinf.nanotomy.webcontrol;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloRest {

    @GetMapping(value = "/rest1")
    public String getHello() {
        return "Hello Spring Boot!";
    }
}