package cn.chenzw.springcloud.basic.eureka.client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say")
    public String say(String name) {
        return "hi," + name + "!";
    }
}
