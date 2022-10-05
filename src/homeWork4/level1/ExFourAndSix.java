package homeWork4.level1;

public class ExFourAndSix {
    int div(int a, int s, int c) {
        return a + s + c;
    }

    long div(long a, int s, int c) {
        return a + s + c;
    }

    long div(long a, long s, short c) {
        return a + s + c;
    }

    long div(long a, long s, long c) {
        return a + s + c;
    }

    long div(long a, int s, short c) {
        return a + s + c;
    }

    public static void main(String[] args) {
        ExFourAndSix exFourAndSix = new ExFourAndSix();
        System.out.println(exFourAndSix.div(5, 7, 2));
    }
}