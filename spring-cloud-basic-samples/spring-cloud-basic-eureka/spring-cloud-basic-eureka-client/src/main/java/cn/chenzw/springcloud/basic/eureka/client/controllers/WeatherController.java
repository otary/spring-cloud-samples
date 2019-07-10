package cn.chenzw.springcloud.basic.eureka.client.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 提供服务
 *
 * @author chenzw
 */
@RestController
@RequestMapping("/weathers")
public class WeatherController {

    @GetMapping("/today")
    public String today() {
        return "temperature: 25, humidity: 82, info: 阴, direct: 西北风, power: 3级";
    }
}
