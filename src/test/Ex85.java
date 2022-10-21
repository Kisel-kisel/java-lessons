package test;

public class Ex85 {
    public static void main(String[] args) {
//        Пройти по двухзначным числам, находим одно делиться на другое
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (i % j == 0 && i != j) {
                    System.out.println(i + " : " + j);
                }
            }
        }
    }
}
