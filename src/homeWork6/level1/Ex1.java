package homeWork6.level1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfPerson = scanner.nextInt();
        if (ageOfPerson > 18) {
            System.out.println("you can look film");
        } else {
            System.out.println("you can not look film");
        }
    }
}
