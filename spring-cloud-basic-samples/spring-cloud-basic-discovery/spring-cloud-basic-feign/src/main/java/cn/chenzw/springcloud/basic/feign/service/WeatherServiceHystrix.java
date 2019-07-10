package cn.chenzw.springcloud.basic.feign.service;

import org.springframework.stereotype.Component;

/**
 * 断路由
 */
@Component
public class WeatherServiceHystrix implements WeatherService {

    @Override
    public String todayFromClient() {
        return "请求异常,断路由熔断！";
    }
}
