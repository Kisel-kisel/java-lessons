package basic.homeWork3.homeWork11.homeWork10;
//Напишите метод, который принимает строку и два символа. В результате он возвращает заданную строку,
//где каждый первый символ был заменен вторым символом. Вы должны использовать только методы
//length() и charAt() класса String. Например: «Я всегда делаю домашнее задание», «a», «A» ->
//«Я всегдА делАю домашнее зАдАние».
//используйте циклы
public class Ex7 {
    public static void main(String[] args) {
        String str = "Я всегда делаю домашнее задание";
        String strAfter = getStrAfter(str, 'a', 'A');
    }

    private static String getStrAfter(String str, char from, char to) {
        String strAfter = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == from) {
                strAfter += to;
            } else {
                strAfter += c;
            }
        }
        return strAfter;
    }
}