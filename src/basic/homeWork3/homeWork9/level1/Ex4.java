package basic.homeWork3.homeWork9.level1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0){
            int last = number % 10;
            sum += last;
            number /= 10;
        }
        System.out.println(sum);
    }
}
