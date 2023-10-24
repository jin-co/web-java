package com.example.formval.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CodeValidator implements ConstraintValidator<Code, String> {
    private String prefix;

    @Override
    public void initialize(Code code) {
        prefix = code.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = true;
        if (code != null) {
            result = code.startsWith(prefix);
        }
        return result;
    }
}
