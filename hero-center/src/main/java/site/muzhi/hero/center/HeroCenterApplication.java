package site.muzhi.hero.center;

import org.mybatis.spring.annotation.MapperScan;
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
@EnableFeignClients
@MapperScan(basePackages = "site.muzhi.hero.center.repo.mapper")
@ComponentScan(basePackages = "site.muzhi.hero")
public class HeroCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroCenterApplication.class, args);
    }

}

