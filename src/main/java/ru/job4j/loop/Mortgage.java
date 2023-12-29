package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double creit = amount + (amount * percent * 0.01);
        while (creit > salary) {
            creit -= salary;
            year++;
        }

        return year;
    }
}