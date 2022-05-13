package site.muzhi.hero.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class HeroJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeroJobApplication.class, args);
    }

}
