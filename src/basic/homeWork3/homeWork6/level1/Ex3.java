package basic.homeWork3.homeWork6.level1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double priceOfCakes = 0.5;
        System.out.println("Какое количество печенья вы хотите купить?");
        Scanner scanner = new Scanner(System.in);
        int countOfCakes = scanner.nextInt();
        System.out.println("Имеющаяся у Вас сумма денег?");
        int countOfMoney = scanner.nextInt();
        double result = countOfMoney / (countOfCakes * priceOfCakes);
//        System.out.println(result);
        if (result >= 1){
            System.out.println("Вы можете купить желаемое количество печенья?");
        } else {
            System.out.println("Вы НЕ можете купить желаемое количество печенья?");
        }
    }
}
