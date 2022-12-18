package basic.homeWork3.homeWork11.level2;

import java.util.Arrays;
import java.util.Random;
//Дан массив(сгенерируйт значения). Найти среднее арифметическое его элементов.
// Вывести на экран только те элементы массива, которые больше найденного среднего арифметического.
public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        double count = 0;
        for(int i = 0;i< array.length;i++){
            array[i]= random.nextInt(100);
            count += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
        double middle = count / array.length;
        System.out.println(middle);
        for(int j = 0;j< array.length;j++){
            if (array[j]>middle) {
                System.out.println(array[j]);
            }
        }
    }
}
