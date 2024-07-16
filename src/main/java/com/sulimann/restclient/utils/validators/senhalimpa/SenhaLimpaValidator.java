package com.sulimann.restclient.utils.validators.senhalimpa;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

import com.sulimann.restclient.utils.constants.Regex;

public class SenhaLimpaValidator implements ConstraintValidator<SenhaLimpa, String>{

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (!StringUtils.hasText(value)) {
            return true;
        }
        return !value.matches(Regex.SENHA_LIMPA);
    }

}
