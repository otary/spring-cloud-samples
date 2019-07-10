package cn.chenzw.springcloud.basic.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 只需要接口
 *
 * @author chenzw
 */
@FeignClient(value = "SPRING-CLOUD-BASIC-EUREKA-CLIENT", fallback = WeatherServiceHystrix.class)
public interface WeatherService {

    @GetMapping(value = "/weathers/today")
    String todayFromClient();


}
