package com.sulimann.restclient.utils.validators.cep;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.sulimann.restclient.utils.constants.Regex;

public class CepValidator implements ConstraintValidator<Cep, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!StringUtils.hasText(value)) {
            return false;
        }
        return value.matches(Regex.CEP);
    }

}
