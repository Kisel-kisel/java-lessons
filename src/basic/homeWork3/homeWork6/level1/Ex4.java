package basic.homeWork3.homeWork6.level1;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean igl = random.nextBoolean();
//        System.out.println(igl);
        if (igl == true){
            System.out.println("Орел");
        } else {
            System.out.println("Решка");
        }
    }
}
