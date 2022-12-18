package basic.homeWork3.homeWork11.homeWork10;
//Двузначное десятичное число в сумме с числом,
// записанным теми же цифрами, но в обратном порядке,
// дает полный квадрат. Найти все такие числа.
public class Ex2 {
    public static void main(String[] args) {
        for ( int i = 10; i < 100; i++){
            int revers = revers(i);
            if (isFullSquare(revers * i)){
                System.out.println(i);
            }
        }
    }
    private static boolean isFullSquare(int num){
        double sqrt = Math.sqrt(num);
        int sqrtVal = (int) sqrt;
        return (sqrtVal * sqrtVal) == num;
    }

    static int revers(int i){
        int revers = 0;
        while (i > 0){
            revers = revers * 10 + i % 10;
            i = i / 10;
        }
        return revers;
    }
}
