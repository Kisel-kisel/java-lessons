package homeWork6.level2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Порядковый номер машины: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfCar = scanner.nextInt();
        boolean div = numberOfCar % 2 == 0;
        System.out.println("Грузовая ли машина?");
        boolean isLorry = scanner.nextBoolean();
        System.out.println("Сегодня выходной день?");
        boolean isWeekend = scanner.nextBoolean();
//        div && !isLorry && isWeekend
        if (div) {//четная машина ok
            if (!isLorry) {//негрузовая ок
                if (isWeekend) {//выходной день ок
                    System.out.println("1 можно чётный легковой в выходно");
                } else {
                    System.out.println("2 нельзя чётным легковым в будний день");//невыходной день not
                }
            } else if (isWeekend){
                System.out.println("3 нельзя грузовым в выходной день");//грузовая not
            }else{
                System.out.println("4 можно грузовой в будний ");
            }

        }else {
            System.out.println("4");// нечётная машина not
        }

    }
}


