package homeWork11.level1;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            int array2 = array[i] * 2;
            System.out.println(array2);
        }
        System.out.println(Arrays.toString(array));

    }
    }

