package com.example;

import java.util.Random;

public class Rand {

    public static String generatePassword(int passwordLength) { // Генерация
        String result = new String();

        for (int i = 0; i < passwordLength; i++) {

            result += randomInt2String(0, 1);
        }
        return result;
    }

    public static String randomInt2String(int minValue, int maxValue) { // Переводит из Int в String, выбирает случайную цифру от 0 до 1
        int diff = maxValue - minValue;
        java.util.Random random = new java.util.Random();
        String result = String.valueOf(random.nextInt(diff + 1) + minValue);
        return result;
    }
}

