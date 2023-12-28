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
        float input = 140;
        float expected = 2;
        float euro = Converter.rubleToEuro(input);
        System.out.println(input + " rubles are " + euro + " euro. Test result " + (expected == euro));

        input = 4;
        expected = 280;
        float euroToRuble = Converter.euroToRuble(input);
        System.out.println(input + " euro are " + euroToRuble + " rubles. Test result " + (expected == euroToRuble));

        input = 180;
        expected = 3;
        float dollar = Converter.rubleToDollar(input);
        System.out.println(input + " rubles are " + dollar + " dollar. Test result " + (expected == dollar));

        input = 5;
        expected = 300;
        float dollarToRuble = Converter.dollarToRuble(input);
        System.out.println(input + " dollar are " + dollarToRuble + " rubles. Test result " + (expected == dollarToRuble));
    }
}
