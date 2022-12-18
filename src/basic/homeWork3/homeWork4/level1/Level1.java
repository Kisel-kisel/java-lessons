package level1;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        int first0 = first.length();
        System.out.println("1.Длинна строки: " + first0);

         String str1 = "Java";
         String str2 = "I love";
         System.out.println("2.Склейка двух строк: " + str2.concat(str1));

         Home differ = new Home(5,15,"BLACK",true);
//         Home differ = new Home();
//         differ.flour = 3;
//         differ.rooms = 11;
//         differ.color = "WHITE";
//         differ.lift = false;

    }

    public static class Home {
            int flour;
            int rooms;
            String color;
            Boolean lift;

            public Home(int flour, int rooms, String color, boolean lift){
            this.flour = flour;
            this.rooms = rooms;
            this.color = color;
            this.lift = lift;


            }
    }
}
