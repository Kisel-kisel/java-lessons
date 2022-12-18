package basic.homeWork3.homeWork11.level2;

import java.util.Arrays;
import java.util.Random;
//Все элементы массива поделить на значение наибольшего элемента этого массива.
//        Задача состоит из двух подзадач:
//
//        Поиск максимума.
////        Деление на него элементов массива.
//НАОБОРОТ
public class Ex1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int number= 100;
        for (int i = 0;i<array.length;i++){
            array[i]= random.nextInt(100);
            if(number>array[i]){
                number=array[i];
            }
    }
        System.out.println(Arrays.toString(array));
        System.out.println(number);
        for (int j = 0;j<array.length;j++){
            array[j] /= number;
        }
        System.out.println(Arrays.toString(array));
    }

}
