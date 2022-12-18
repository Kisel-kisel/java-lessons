package basic.homeWork3.test;

//import java.util.Random;

import java.util.Random;

public class Les8 {
    public static void main(String[] args) {
//        int i;
//        for (i = 3;i <= 5;i++){
//            System.out.println(i);
//        }
//        for (int a = 1; a > 0; a = a + 1){
//            System.out.println(a);
//            Random random = new Random();
//            int r = random.nextInt(1000);
//            if ( r <= 50);
//            break;
//        }
        Random random = new Random();
        int from = 1;
        int to = 50;
        for (int i = from; i <= to; i++){
            boolean isEagle = random.nextBoolean();
            if (isEagle){
                System.out.println("Орел");
            }else{
                System.out.println("Решка");
            }
        }
    }
}
