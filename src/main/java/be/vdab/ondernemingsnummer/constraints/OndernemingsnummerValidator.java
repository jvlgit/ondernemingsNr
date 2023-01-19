package be.vdab.ondernemingsnummer.constraints;

import be.vdab.ondernemingsnummer.domain.Firma;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class OndernemingsnummerValidator implements ConstraintValidator<OndernemingsNr, Long> {
    @Override
    public void initialize(OndernemingsNr constraintAnnotation) {}

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        var laatste2Cijfers = value % 100;
        var overigeCijfers = value / 100;
        return laatste2Cijfers == 97 - overigeCijfers % 97;
    }
}
