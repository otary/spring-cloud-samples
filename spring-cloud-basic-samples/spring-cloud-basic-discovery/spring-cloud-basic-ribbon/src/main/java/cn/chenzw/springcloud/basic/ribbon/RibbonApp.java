package cn.chenzw.springcloud.basic.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class RibbonApp {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApp.class, args);
    }
}
