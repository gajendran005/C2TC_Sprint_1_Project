package com.tnsif.Mall.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.tnsif.Mall.service.MallService;

@Configuration
public class MallConfig {

    @Bean
    public MallService mallService() {
        return new MallService();
    }
}

