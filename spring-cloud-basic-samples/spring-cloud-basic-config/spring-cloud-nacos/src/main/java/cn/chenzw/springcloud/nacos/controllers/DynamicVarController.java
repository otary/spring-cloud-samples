package cn.chenzw.springcloud.nacos.controllers;

import cn.chenzw.springcloud.nacos.properties.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 自动刷新配置
 */
@RefreshScope
@RestController
@RequestMapping("/dynamic-var")
public class DynamicVarController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private Integer age;

    @Autowired
    UserProperties userProperties;

    @GetMapping("/getName")
    public String getName() {
        return name + ":" + userProperties;
    }


}
