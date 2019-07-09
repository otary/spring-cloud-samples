package cn.chenzw.springcloud.basic.ribbon.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String sayHello(String name) {
        return restTemplate.getForObject("http://SPRING-CLOUD-BASIC-EUREKA-CLIENT/hello/say?name=" + name, String.class);
    }

}
