package homeWork7.level2;

import java.util.Scanner;

public class Ex4A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMoney = scanner.nextInt();
        boolean honest = numberOfMoney > 0 && numberOfMoney < 10000;
        int thousant = numberOfMoney / 1000;
        int hungred = numberOfMoney / 100 - (thousant * 10);
        int dozen = numberOfMoney % 100 / 10;
        int simpleNumber = numberOfMoney % 10;
//        System.out.println(thousant);
//        System.out.println(hungred );
//        System.out.println(dozen);
//        System.out.println(simpleNumber);
        if (honest) {
            System.out.println("Сумма выдачи: " + thousant + hungred + dozen + simpleNumber);
        } else {
            System.out.println("Сумма выдачи: вне диапазона");
        }

        switch (thousant){
            case 1:
                System.out.println("Одна тысяча");
                break;
            case 2:
                System.out.println("Две тысячи");
                break;
            case 3:
                System.out.println("Три тысячи");
                break;
            case 4:
                System.out.println("Четыре тысячи");
                break;
            case 5:
                System.out.println("пять тысяч");
                break;
            case 6:
                System.out.println("шесть тысяч");
                break;
            case 7:
                System.out.println("семь тысяч");
                break;
            case 8:
                System.out.println("восемь тысяч");
                break;
            case 9:
                System.out.println("девять тысячь");
                break;
            default:
                System.out.println("такого значения нет");
        }
        switch (dozen){
            case 1:
                System.out.println("сто");
                break;
            case 2:
                System.out.println("двесте");
                break;
            case 3:
                System.out.println("триста");
                break;
            case 4:
                System.out.println("четыреста");
                break;
            case 5:
                System.out.println("пятьсот");
                break;
            case 6:
                System.out.println("шестьсот");
                break;
            case 7:
                System.out.println("семьсот");
                break;
            case 8:
                System.out.println("восемьсот");
                break;
            case 9:
                System.out.println("девятьсот");
                break;
            default:
                System.out.println("такого значения нет");
    }
        switch (thousant){
            case 1:
                System.out.println("Одна тысяча");
                break;
            case 2:
                System.out.println("Две тысячи");
                break;
            case 3:
                System.out.println("Три тысячи");
                break;
            case 4:
                System.out.println("Четыре тысячи");
                break;
            case 5:
                System.out.println("пять тысяч");
                break;
            case 6:
                System.out.println("шесть тысяч");
                break;
            case 7:
                System.out.println("семь тысяч");
                break;
            case 8:
                System.out.println("восемь тысяч");
                break;
            case 9:
                System.out.println("девять тысячь");
                break;
            default:
                System.out.println("такого значения нет");
}
