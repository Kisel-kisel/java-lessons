package homeWork6.level1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ( year % 4 == 0){
            System.out.println("да");
        } else {
            System.out.println("Нет ");
        }
    }
}
