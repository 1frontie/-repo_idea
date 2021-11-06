package com.lahou.jenkinsdemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemon1Controller {
    @GetMapping("/")
    public String hello(){
        return "docker-maven-plugins hello !!!";

    }

}
