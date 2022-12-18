package basic.homeWork3.homeWork4_2.Level2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numb=scanner.nextDouble();
        double cur=scanner.nextDouble();
        Ex3 a=new Ex3();
        System.out.println(a.calk(numb,cur));

//        System.out.println(a.calk(50,0.94));
    }
    double calk(double number, double curs){
        return number*curs;
    }
}
