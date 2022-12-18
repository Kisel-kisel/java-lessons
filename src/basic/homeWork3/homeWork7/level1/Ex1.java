package basic.homeWork3.homeWork7.level1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFlat = scanner.nextInt();
        if (numberOfFlat > 0 && numberOfFlat < 21){
            System.out.println("Квартира находится в первом подъезде!");
        } else if (numberOfFlat > 20 && numberOfFlat < 49){
            System.out.println("Квартира находится в втором подъезде!");
        } else if (numberOfFlat > 49 && numberOfFlat <= 90){
            System.out.println("Квартира находится в третьем подъезде!");
        }else{
            System.out.println("Такого номера квартиры в доме нет!");
    }
    }
}
