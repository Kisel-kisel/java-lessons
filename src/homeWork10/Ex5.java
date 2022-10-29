package homeWork10;

import java.util.Scanner;

//С клавиатуры вводятся целые числа до первого числа,
// которое меньше двух. Написать программу, которая определяет сколько простых чисел было введено.
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        do{
            i = scanner.nextInt();
            if (simple(i) && i>=2){
                sum++;
            }
        } while (i>=2);
        System.out.println(sum);
    }
    private  static boolean simple(int i){
        for (int j = 2; j <= i/2; j++){
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
