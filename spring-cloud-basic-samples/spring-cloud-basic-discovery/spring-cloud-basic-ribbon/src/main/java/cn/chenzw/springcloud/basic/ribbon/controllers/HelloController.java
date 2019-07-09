package cn.chenzw.springcloud.basic.ribbon.controllers;

import cn.chenzw.springcloud.basic.ribbon.serivce.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @GetMapping("/say")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }

}
