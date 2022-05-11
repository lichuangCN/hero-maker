package site.muzhi.hero.core.configuation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lichuang
 * @date 2022/05/11
 * @description
 */
@Configuration
public class LocalDateTimeSerializer {

    @Value("${spring.jackson.date-format}")
    private String  pattern;

    @Bean
    public 



}
