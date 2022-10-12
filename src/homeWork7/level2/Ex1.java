package homeWork7.level2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMoney = scanner.nextInt();
        boolean honest = numberOfMoney > 0 && numberOfMoney < 10000;
        int thousant = numberOfMoney / 1000;
        int hungred = numberOfMoney / 100 - (thousant * 10);
        int dozen = numberOfMoney % 100 / 10;
        int simpleNumber = numberOfMoney % 10;
        System.out.println(thousant);
        System.out.println(hungred );
        System.out.println(dozen);
        System.out.println(simpleNumber);
        if (honest) {
            System.out.println("Сумма выдачи: " + thousant + hungred + dozen + simpleNumber);
        } else {
            System.out.println("Сумма выдачи: вне диапазона");
        }
    }
}
