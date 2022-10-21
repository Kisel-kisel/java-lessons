package homeWork8.Level2;

public class Ex2 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 0; i < 101; i++){
            if( i % 2 != 0 ){
                sum = sum + i;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}
