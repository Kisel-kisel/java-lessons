package basic.homeWork3.homeWork4_2.Level2;

public class Ex4 {
    static char customFunc(String str, int cutFrom, int symbolIndex) {
        String substring = str.substring(cutFrom);
        return substring.charAt(symbolIndex);
    }

    public static void main(String[] args) {
        System.out.println(customFunc("Мама Мыла Раму", 8, 3));
    }
}
