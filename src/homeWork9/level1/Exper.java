package homeWork9.level1;

import java.util.Scanner;

public class Exper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int sum = 0;
        for(int i = numberOne; i < numberTwo; i++ ){
            if(i / 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
