package homeWork8.Level1;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random random = new Random();
        int simple = random.nextInt();
//        System.out.println(simple);
        int rase = 0;
        for(int i = 1; i <= simple; i++  ){
        if(simple % i == 0 ){
        rase++;
        }
        }
        if(rase == 2){
            System.out.println("Простое число");
        }else {
            System.out.println("Нет");
        }
    }
}
