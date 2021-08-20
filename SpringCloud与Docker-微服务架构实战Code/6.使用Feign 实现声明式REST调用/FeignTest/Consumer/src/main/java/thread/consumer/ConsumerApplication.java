package thread.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import thread.consumer.feign.FeignConfiguration;

@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients //开启Feign全部的Client
@EnableFeignClients(defaultConfiguration = FeignConfiguration.class)    //开启全局的Feign配置
public class ConsumerApplication {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
