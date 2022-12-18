package basic.homeWork3.homeWork6.level2;

import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int min = 0;
        int max = 28800;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);//delete
        int hours = i / 3600;
        int minutes = (i % 3600) / 60;
        int seconds = (i % 3660) % 60;
        System.out.println("До окончания рабочего дня осталось: " + hours + " часов " + minutes + " минут " + seconds + " секунд!");

    }
}
