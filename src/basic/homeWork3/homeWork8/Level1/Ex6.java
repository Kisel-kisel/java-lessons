package homeWork8.Level1;

public class Ex6 {
    public static void main(String[] args) {
        int num  = 1;
        for( int i = 13; i < 100; i++){
            if (i % 2 != 0 && i % 13 == 0){
                num = num * i;
                System.out.println(num);
            }
        }
    }
}
