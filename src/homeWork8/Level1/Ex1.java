package homeWork8.Level1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите число №1:");
        Scanner scanner = new Scanner(System.in);
        int yearOne = scanner.nextInt();
        System.out.println("Введите число №2:");
        int yearTwo = scanner.nextInt();
        int result = (yearTwo - yearOne) / 4;
        System.out.println(result + " - количество високосных лет.");
    }
}
