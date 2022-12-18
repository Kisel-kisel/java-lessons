package basic.homeWork3.test;

public class Les81 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//        for (int i = 10; i > 0; i--){
////            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(10 - i);
//        }
        //Вывести сумму четных от 20 до 40
        int sum = 0;
        for (int i = 20; i < 40; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
