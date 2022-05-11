package site.muzhi.hero.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lichuang
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "site.muzhi.hero.core.remote.feign")
@ComponentScan(basePackages = "site.muzhi.hero")
public class HeroWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroWebApplication.class, args);
    }

}
