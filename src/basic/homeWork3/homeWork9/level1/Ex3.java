package basic.homeWork3.homeWork9.level1;

import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(900) + 100;
        System.out.println(number);
        int max = 0;
        while (number > 0){
           int last = number % 10;
           if ( last > max ){
               max = last;
           }
            number /= 10;
        }
        System.out.println(max);
    }
}
