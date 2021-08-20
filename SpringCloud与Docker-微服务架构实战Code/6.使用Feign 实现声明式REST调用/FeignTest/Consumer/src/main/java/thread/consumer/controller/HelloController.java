package thread.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thread.consumer.feign.UserFeignClient;
import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/hello")
    public List<String> hello(){
        List<String> userNames = userFeignClient.getUserNames();
        return userNames;
    }

}
