package homeWork5.level1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(div(number));
    }
   static boolean div (int number){
        return number % 7 ==0 && number % 5 == 0;
    }
}
