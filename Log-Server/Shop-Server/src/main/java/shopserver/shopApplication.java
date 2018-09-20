package shopserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Administrator on 2018/9/19.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class shopApplication {
    public static void main(String[] args) {
        SpringApplication.run(shopApplication.class,args);
    }
}
