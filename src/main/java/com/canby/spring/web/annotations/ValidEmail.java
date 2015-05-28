package com.canby.spring.web.annotations;

import com.canby.spring.web.validators.AcEmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by acanby on 26/05/2015.
 */

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = AcEmailValidator.class)
public @interface ValidEmail {
    String message() default "Your email address could not be validated";

    String regex() default "\\w+@\\w+\\.\\w+";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
