package pl.docker.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/hello"))
public class AppController {

    @GetMapping
    public String hello() {
        return "Hello Docker";
    }

}
