package basic.homeWork3.homeWork7.level1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month > 0 && month < 3 || month == 12){
            System.out.println("Зима");
        } else if (month > 2 && month < 6){
            System.out.println("Весна");
        } else if (month > 5 && month < 9){
            System.out.println("Лето");
        }else if (month > 8 && month < 12) {
            System.out.println("Осень");
        }else {
            System.out.println("Такого месяца нет!");
        }
    }
}
