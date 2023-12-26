package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double result = i * h;
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        double result2 = RectangleArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result2);
    }
}