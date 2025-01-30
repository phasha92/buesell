package com.example.buesell.errors.strategy;

import org.springframework.stereotype.Component;

@Component
public class Error404 implements ErrorStrategy {
    @Override
    public String handleError() {
        return "404";
    }
}
