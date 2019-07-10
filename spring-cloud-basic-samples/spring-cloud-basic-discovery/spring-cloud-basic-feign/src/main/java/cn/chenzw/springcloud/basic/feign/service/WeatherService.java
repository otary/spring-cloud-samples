package cn.chenzw.springcloud.basic.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "SPRING-CLOUD-BASIC-EUREKA-CLIENT")
public interface WeatherService {

    @GetMapping(value = "/weathers/today")
    String todayFromClient();
}
