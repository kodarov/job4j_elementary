package ru.job4j.condition;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 2, 2, 0);
        double result3 = Point.distance(1, 1, 2, 0);
        double result4 = Point.distance(5, 10, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (2, 2) to (2, 0) " + result2);
        System.out.println("result (1, 1) to (2, 0) " + result3);
        System.out.println("result (5, 10) to (2, 0) " + result4);
    }
}