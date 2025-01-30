package com.example.buesell.errors.strategy;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ErrorStrategyRegistry {

    private final Map<Integer, ErrorStrategy> errorStrategyMap;

    public ErrorStrategyRegistry(Map<Integer, ErrorStrategy> errorStrategyMap) {
        this.errorStrategyMap = errorStrategyMap;
    }

    public ErrorStrategy getStrategyForStatusCode(Integer statusCode) {
        return errorStrategyMap.getOrDefault(statusCode, new ErrorUnknown());
    }
}
