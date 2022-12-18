package basic.homeWork3.homeWork9.level1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int sum = 0;
        while (numberOne < numberTwo){
            if(numberOne % 2 != 0){
                sum += numberOne;
            }
            numberOne++;

        }
        System.out.println(sum);
    }
}
