package homeWork6.level2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число № 1 ");
        int fitstNum = scanner.nextInt();
        System.out.println("Введите число № 2");
        int secondNum = scanner.nextInt();
        System.out.println("Введите число № 3");
        int thirdNum = scanner.nextInt();
        if (fitstNum > secondNum && fitstNum > thirdNum){
            System.out.println("Максимальное число среди введённых: " + fitstNum);
        }else if (secondNum > fitstNum && secondNum > thirdNum){
            System.out.println("Максимальное число среди введённых: " + secondNum);
        }else{
            System.out.println("Максимальное число среди введённых: " + thirdNum);
        }
    }
}
