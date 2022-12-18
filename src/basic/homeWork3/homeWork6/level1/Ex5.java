package basic.homeWork3.homeWork6.level1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Порядковый номер машины: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfCar = scanner.nextInt();
        boolean car = 1 <= numberOfCar && numberOfCar  <= 10000;
        boolean div = numberOfCar % 2 == 0;
        System.out.println("Легковая ли машина?");
        boolean isLorry = scanner.nextBoolean();
        if (div && car && isLorry){
            System.out.println("Можете проезжать!");
        }else {
            System.out.println("НЕ Можете проезжать!");
        }
    }
}
