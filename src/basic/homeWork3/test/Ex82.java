package basic.homeWork3.test;

import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sun = 0;
        int i;
        for (i = 1; i < number; i++) {
            sun = sun + i;
        }
        System.out.println(sun);
    }


}
