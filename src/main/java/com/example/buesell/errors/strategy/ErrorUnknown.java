package com.example.buesell.errors.strategy;

import org.springframework.stereotype.Component;

@Component
public class ErrorUnknown implements ErrorStrategy{
    @Override
    public String handleError() {
        return "error.unknown";
    }
}
