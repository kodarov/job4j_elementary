package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        double expected = 2;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when5Minus3to62then5Dot09() {
        Point a = new Point(5, -3);
        Point b = new Point(6, 2);
        double output = a.distance(b);
        double expected = 5.09;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus6Minus10to2Minus17then10Dot63() {
        Point a = new Point(-6, -10);
        Point b = new Point(2, -17);
        double output = a.distance(b);
        double expected = 10.63;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when07to53then6Dot4() {
        Point a = new Point(0, 7);
        Point b = new Point(5, 3);
        double output = a.distance(b);
        double expected = 6.4;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to530then5Dot83() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(5, 3, 0);
        double output = a.distance3d(b);
        double expected = 5.83;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when573to231then5Dot38() {
        Point a = new Point(5, 7, 3);
        Point b = new Point(2, 3, 1);
        double output = a.distance3d(b);
        double expected = 5.38;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}