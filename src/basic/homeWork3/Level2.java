package basic.homeWork3;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        System.out.println("1.Введите своё имя:");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        System.out.println("Hello " + in + "!");
        System.out.println("2.Введите своё имя:");
        String in0 = scanner.nextLine();
        char in1 = in0.charAt(0);
        System.out.println("Ваше имя начинается с буквы: " + in1 + "!");
        double num = 59.976;
        int cdi = (int) Math.floor(num);
        System.out.println("3.Целое из числа и перевод в int: " + cdi);
        int cib = 476;
        short cbi = (short) cib;
        System.out.println("4.перевод числа типа int в short: " + cbi);
    }
}
