package homeWork4;

public class ExFour {
    int div (int a, int s, int c) {
        return a + s + c;
    }
    long div (long a, int s, int c) {
        return a + s + c;
    }
    long div (long a, long s, short c) {
        return a + s + c;
    }
    long div (long a, long s, long c) {
        return a + s + c;
    }
    long div (long a, int s, short c) {
        return a + s + c;
    }

    public static void main(String[] args) {
        ExFour exFour = new ExFour();
        System.out.println(exFour.div(5,7,2));
    }
}
