package basic.homeWork3.homeWork4_2.Level1.Ex3;

public class Ex5 {
    double Farengeit(double Cel){
        return Cel * 1.8 + 32;
    }
    double Cel(double Far){
        return Far/1.8 - 32;
    }

    public static void main(String[] args) {
        Ex5 any=new Ex5();
        System.out.println(any.Farengeit(60));
    }
}
