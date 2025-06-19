package com.simplilearn.springjenkins.springjenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HelloController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
