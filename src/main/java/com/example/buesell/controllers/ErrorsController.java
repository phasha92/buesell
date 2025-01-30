package com.example.buesell.controllers;

import com.example.buesell.errors.strategy.ErrorStrategyRegistry;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorsController implements ErrorController {

    private final ErrorStrategyRegistry errorStrategyRegistry;

    public ErrorsController(ErrorStrategyRegistry errorStrategyRegistry) {
        this.errorStrategyRegistry = errorStrategyRegistry;
    }

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("jakarta.servlet.error.status_code");
        return errorStrategyRegistry.getStrategyForStatusCode(statusCode).handleError();
    }
}
