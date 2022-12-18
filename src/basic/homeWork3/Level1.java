package basic.homeWork3;

public class Level1 {
    public static void main(String[] args) {
        String str = "I study Basic Java!";
        char s = str.charAt(str.length() - 1);
        System.out.println("последний символ строки: " + s);
        System.out.println("содержит ли строка подстроку “Java”: " + str.contains("Java"));
        System.out.println("Замена символов “а” на “о: " + str.replace("a","o"));
        System.out.println("Преобразование строки к верхнему регистру: " + str.toUpperCase());
        System.out.println("Преобразование строки к нижнему регистру:  " + str.toLowerCase());
        String jaStr = "Java";
        System.out.println("Вырезать строку Java: " + str.substring((str.indexOf(jaStr)), str.indexOf(jaStr) + jaStr.length()));
        System.out.println("процент числа 200 от 470: " + (200 / 470.0) * 100);
        char ind = 'q';
        int ind2 = ind;
        System.out.println("индекс у символа 'g': " + ind2);
        System.out.println("индекс у символа 'g': ");

    }
}
