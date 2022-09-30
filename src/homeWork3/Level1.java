package homeWork3;

import java.util.Locale;

public class Level1 {
    public static void main(String[] args) {
        String str = "I study Basic Java!";
        int strin = str.length();
        char s = str.charAt(strin - 1);
        System.out.println("последний символ строки: " + s);
        System.out.println("содержит ли строка подстроку “Java”: " + str.contains("Java"));
        System.out.println("Замена символов “а” на “о: " + str.replace("a","o"));
        System.out.println("Преобразование строки к верхнему регистру: " + str.toUpperCase());
        System.out.println("Преобразование строки к нижнему регистру:  " + str.toLowerCase());
        System.out.println("Вырезать строку Java: " + str.substring(14,18));
        System.out.println("процент числа 200 от 470: " + (200 / 470.0) * 100);
        System.out.println("индекс у символа 'g': " + str.indexOf('g'));

    }
}
