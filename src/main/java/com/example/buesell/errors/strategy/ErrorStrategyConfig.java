package com.example.buesell.errors.strategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ErrorStrategyConfig {
    @Bean
    public Map<Integer, ErrorStrategy> errorStrategyMap(Error404 error404, ErrorUnknown errorUnknown){
        return Map.of(
                404, error404,
                500, errorUnknown
        );
    }
}
