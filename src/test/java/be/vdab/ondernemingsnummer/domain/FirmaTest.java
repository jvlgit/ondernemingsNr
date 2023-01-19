package be.vdab.ondernemingsnummer.domain;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class FirmaTest {
    private Validator validator;
    private Firma firma;
    @BeforeEach
    void beforeEach() {
        var factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
        firma = new Firma();
    }
    @Test
    void correctOndernemingsNr() {
        firma.setOndernemingsNr(426388541);
        assertThat(validator.validate(firma)).isEmpty();
    }

    @Test
    void verkeerdOndernemingNummer() {
        firma.setOndernemingsNr(426388540);
        assertThat(validator.validate(firma)).isNotEmpty();
    }
}
