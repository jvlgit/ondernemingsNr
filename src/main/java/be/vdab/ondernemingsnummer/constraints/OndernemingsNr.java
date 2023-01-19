package be.vdab.ondernemingsnummer.constraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Positive;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = {OndernemingsnummerValidator.class})
public @interface OndernemingsNr {
    String message() default "{be.vdab.OndernemingsNr.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
