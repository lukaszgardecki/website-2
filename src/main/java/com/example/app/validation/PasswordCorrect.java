package com.example.app.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordCorrectValidator.class)
@Documented
public @interface PasswordCorrect {
    String message() default "{com.example.app.validator.PasswordCorrect.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    @Target({TYPE, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List
    {
        PasswordCorrect[] value();
    }
}
