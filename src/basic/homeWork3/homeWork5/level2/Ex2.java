package basic.homeWork3.homeWork5.level2;

import java.util.Scanner;

public class Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(resul(first, second));
    }
   static boolean resul ( int first, int second){
        return first % second == 0;
    }
}
