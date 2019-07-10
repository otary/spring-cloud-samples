package cn.chenzw.springcloud.basic.config.git.client.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SamplesService {

    @Value("${a}")
    private Integer a;

    public String print(){
        System.out.println("---------------" + a);
        return "111";
    }
}
