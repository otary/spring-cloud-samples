package cn.chenzw.springcloud.basic.config.git.client.service;

import cn.chenzw.springcloud.basic.config.git.client.ConfigGitClientApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = ConfigGitClientApp.class)
public class SamplesServiceTests {

    @Autowired
    SamplesService samplesService;

    @Test
    public void testPrint(){
        samplesService.print();
    }
}
