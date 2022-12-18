package basic.homeWork3.homeWork11.level1;

import java.util.Arrays;
import java.util.Random;
//С 8 до 20 часов температура воздуха измерялась ежечасно. Известно,
// что в течение этого времени температура понижалась. Определите,
// в котором часу была впервые отмечена отрицательная температура.

public class Ex3 {
    public static void main(String[] args) {
        int[] hours = new int[13];
        int[] temperature = new int[13];
        int shift = 1;
        Random random = new Random();
        int j = 0;
        for (int i = 8; i < 21; i++) {
            hours[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(hours));
        for (int q = 0; q < temperature.length; q++) {
            temperature[q] = random.nextInt(1) - shift + 10;
            shift += 1;
        }
            System.out.println(Arrays.toString(temperature));
        for (int q = 0; q < temperature.length; q++){
            if (temperature[q]<0){
                System.out.println("температура " + temperature[q]+ " в " + hours[q] + " часов.");
                break;
            }
        }
        }
    }

