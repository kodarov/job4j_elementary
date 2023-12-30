package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("ages length: " + ages.length);
        System.out.println("surnames length: " + surnames.length);
        System.out.println("prices length: " + prices.length);

        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Nick";
        names[2] = "Dennis";
        names[3] = "Alex";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
