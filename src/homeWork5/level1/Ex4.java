package homeWork5.level1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(strLen(str));
    }
   static boolean strLen ( String str){
        return str.length() < 7;
   }
}
