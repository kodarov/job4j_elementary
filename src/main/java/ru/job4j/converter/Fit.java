package ru.job4j.converter;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100.00) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110.00) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 175 is " + man);
        System.out.println("Man 175 is " + woman);
    }
}
