package site.muzhi.hero.center;

import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan("site.muzhi.hero.center.repo.mapper")
public class HeroCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroCenterApplication.class, args);
    }

}

