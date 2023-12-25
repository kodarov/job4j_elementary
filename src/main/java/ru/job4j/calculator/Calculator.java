package ru.job4j.calculator;

public class Calculator {
    public static void plus(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);

        int six = 6;
        int four = 4;
        int five = 5;

        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four - two;

        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println("size = " + size);

        /**
         * 4. Методы [#231984]
         */
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);

        int result3 = MathFunction.func1(100);
        System.out.println(result3);
    }
}
