package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float euroToRuble(float value) {
        float result = value * 70;
        return result;
    }

    public static float dollarToRuble(float value) {
        float result = value * 60;
        return result;
    }

    public static void main(String[] args) {
        float input1 = 140;
        float input2 = 120;
        float input3 = 2;

        float euro = Converter.rubleToEuro(input1);
        float dollar = Converter.rubleToDollar(input2);
        float euroToRuble = Converter.euroToRuble(input3);
        float dollarToRuble = Converter.dollarToRuble(input3);

        float expected1 = 2;
        float expected2 = 140;
        float expected3 = 120;

        boolean passed1 = expected1 == euro;
        boolean passed2 = expected1 == dollar;
        boolean passed3 = expected2 == euroToRuble;
        boolean passed4 = expected3 == dollarToRuble;

        System.out.println("140 rubles are " + euro + " euro. Test result " + passed1);
        System.out.println("120 rubles are " + dollar + " dollar. Test result " + passed2);
        System.out.println("2 euro are " + euroToRuble + " rubles. Test result " + passed3);
        System.out.println("2 dollar are " + dollarToRuble + " rubles. Test result " + passed4);
    }
}
