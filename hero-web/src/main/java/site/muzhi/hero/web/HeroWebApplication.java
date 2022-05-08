package site.muzhi.hero.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author lichuang
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class HeroWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroWebApplication.class, args);
    }

}
