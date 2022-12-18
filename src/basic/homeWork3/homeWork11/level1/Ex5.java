package basic.homeWork3.homeWork11.level1;

import java.util.Scanner;
//В массиве, состоящем из N вещественных элементов (вводится из консоли),
// после заполняется случайными числами, найти максимальный по модулю элемент массива.
// Подсказка: модуль числа Math.abs(..)
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Размер");
        int size = scanner.nextInt();
        int[] modul = new int[size];
        System.out.println("Вводим данные");
        for(int j = 0;j<size;j++){
            modul[j]=scanner.nextInt();
        }
        int number = 0;
        for(int i =0;i< modul.length;i++){
            int abs=Math.abs(modul[i]);
            if (number<abs) {
                number=abs;
            }
        }
        System.out.println(number);
    }
}
