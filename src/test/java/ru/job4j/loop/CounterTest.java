package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenStart0Finish5Then15() {
        int input1 = 0;
        int input2 = 5;
        int expected = 15;
        int actual = Counter.sum(input1, input2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish7Then18() {
        int input1 = 5;
        int input2 = 7;
        int expected = 18;
        int actual = Counter.sum(input1, input2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1Then1() {
        int input1 = 1;
        int input2 = 1;
        int expected = 1;
        int actual = Counter.sum(input1, input2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStartMinus10Finish2ThenMinus52() {
        int input1 = -10;
        int input2 = 2;
        int expected = -52;
        int actual = Counter.sum(input1, input2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStartMinus10FinishMinus20Then0() {
        int input1 = -10;
        int input2 = -20;
        int expected = 0;
        int actual = Counter.sum(input1, input2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10ToTenThen0() {
        int start = -10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10ToMinus12Then0() {
        int start = 10;
        int finish = -12;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}