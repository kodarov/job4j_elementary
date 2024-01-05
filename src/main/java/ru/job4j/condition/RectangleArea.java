package ru.job4j.condition;

public class RectangleArea {
    public static double square(double perimeter, double ratio) {
        double height = perimeter / (2 * (ratio + 1));
        double length = height * ratio;
        double result = length * height;
        return result;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(4, 1);
        double result2 = RectangleArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result2);
    }
}