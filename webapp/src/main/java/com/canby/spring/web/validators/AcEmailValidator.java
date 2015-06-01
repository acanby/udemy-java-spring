package com.canby.spring.web.validators;

import com.canby.spring.web.annotations.ValidEmail;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by acanby on 26/05/2015.
 */
public class AcEmailValidator implements ConstraintValidator<ValidEmail, String> {
    Pattern pattern;

    @Override
    public void initialize(ValidEmail validEmail) {
        pattern = Pattern.compile(validEmail.regex());
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
