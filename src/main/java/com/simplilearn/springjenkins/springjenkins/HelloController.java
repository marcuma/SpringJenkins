package com.simplilearn.springjenkins.springjenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HelloController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}
