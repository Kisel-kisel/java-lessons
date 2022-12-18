package basic.homeWork3.homeWork9.level2;

public class Ex1 {
    public static void main(String[] args) {
        int h = 200;
        int n = 50;
        int m = 1;
        int count = 0;
        int current = 1;
        while (current < h){
            count++;
            current += n - m;
        }
        System.out.println(count);
    }
}
