package cn.chenzw.springcloud.basic.config.git.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigGitServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGitServerApp.class, args);
    }
}
