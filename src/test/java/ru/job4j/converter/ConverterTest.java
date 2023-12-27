package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class ConverterTest {

    @Test
    void whenConvert210RblThen3Euro() {
        float input = 210;
        float expected = 3;
        float actual = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3Dollar() {
        float input = 180;
        float expected = 3;
        float actual = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert3EuroThen210Rbl() {
        float input = 3;
        float expected = 210;
        float actual = Converter.euroToRuble(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert3DollarThen180Rbl() {
        float input = 3;
        float expected = 180;
        float actual = Converter.dollarToRuble(input);
        float value = 0.0001f;
        assertThat(actual).isEqualTo(expected, withPrecision(value));
    }
}