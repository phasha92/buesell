package com.example.buesell.validator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ValidRule {

    TITLE("^[а-яА-Яa-zA-Z][а-яА-Яa-zA-Z0-9\\-\\(\\)]{1,49}$"),
    DESCRIPTION("^[а-яА-Яa-zA-Z0-9\\s\\-\\(\\)]{1,255}$"),
    PRICE("^[0-9]{1,10}$"),
    CITY("^[а-яА-Яa-zA-Z][а-яА-Яa-zA-Z0-9\\-\\s]{1,50}$");

    private final String value;

}
