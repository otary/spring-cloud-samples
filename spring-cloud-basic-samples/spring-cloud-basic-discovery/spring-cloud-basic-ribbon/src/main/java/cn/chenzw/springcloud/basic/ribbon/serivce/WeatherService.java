package cn.chenzw.springcloud.basic.ribbon.serivce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 使用restTemplate远程调用
     *
     * @return
     */
    public String today() {
        return restTemplate.getForObject("http://SPRING-CLOUD-BASIC-EUREKA-CLIENT/weatchers/today", String.class);
    }

}
