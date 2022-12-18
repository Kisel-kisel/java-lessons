package basic.homeWork3.homeWork6.level2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
            System.out.println("Порядковый номер машины: ");
            Scanner scanner = new Scanner(System.in);
            int numberOfCar = scanner.nextInt();
        boolean div = numberOfCar % 2 == 0;
            System.out.println("Грузовая ли машина?");
            boolean isLorry = scanner.nextBoolean();
            System.out.println("Сегодня выходной день?");
            boolean isWeekend = scanner.nextBoolean();
            if (div && !isLorry && isWeekend){
                System.out.println("Выходные могут заезжать только легковые автомобили с четными номерами.Вам проезд открыт!");
            }else if (isLorry && !isWeekend ){
                System.out.println("Будние дни для всех грузовых машин проезд открыт!");
            }else if (!div && !isLorry && !isWeekend) {
                System.out.println("Будние дни для леговых автомобилей с нечетными номерами проезд открыт!");
            }else {
                System.out.println("проезд закрыт");
            }
        }
    }


