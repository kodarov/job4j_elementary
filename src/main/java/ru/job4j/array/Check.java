package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean element : data) {
            if (data[0] != element) {
                result = false;
                break;
            }
        }
        return result;
    }
}