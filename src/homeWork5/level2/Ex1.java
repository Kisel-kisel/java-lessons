package homeWork5.level2;

public class Ex1 {
    public static void main(String[] args) {
        int temperatura1 = 90;
        int temperatura2 = 180;
        System.out.println(res(temperatura1,temperatura2));

    }
    public static boolean res (int temperatura1, int temperatura2){
        return temperatura1 >100 && temperatura2 < 100;
    }
}
