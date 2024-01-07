package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then2() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To12To13Then13() {
        int first = 10;
        int second = 12;
        int third = 13;
        int result = Max.max(first, second, third);
        int expected = 13;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax13To12To10Then13() {
        int first = 13;
        int second = 12;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 13;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax13To12To10To100Then100() {
        int first = 13;
        int second = 12;
        int third = 10;
        int fourth = 100;
        int result = Max.max(first, second, third, fourth);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax130To12To10To100Then130() {
        int first = 130;
        int second = 12;
        int third = 10;
        int fourth = 100;
        int result = Max.max(first, second, third, fourth);
        int expected = 130;
        assertThat(result).isEqualTo(expected);
    }
}