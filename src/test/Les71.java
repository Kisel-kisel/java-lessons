package test;

import java.util.Scanner;

public class Les71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finger = scanner.nextInt();
        switch (finger){
            case 1:
                System.out.println("fir");
                break;
            case 2:
                System.out.println("sec");
                break;
            case 3:
                System.out.println("thir");
                break;
            case 4:
                System.out.println("foth");
                break;
            case 5:
                System.out.println("fifth");
                break;
            default:
                System.out.println("no");

        }
    }
}
