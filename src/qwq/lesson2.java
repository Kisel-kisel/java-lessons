package qwq;

public class lesson2 {
    public static void main(String[] args) {
        int doc = 365;
//        365/8 = 5
//        365%8 = 5
//        45/8 = 5
//        45 % = 5
        int oct;
        oct = doc % 8;
        doc = doc / 8;
        oct = oct * 10 + doc % 8;
        doc = doc / 8;
        oct = oct * 10 + doc % 8;
        System.out.println(" dec -> oct for 365: " + oct);
        System.out.println(Integer.toOctalString(365));
        int decAfter;
        decAfter = (oct / 100) * 8 * 8;
        oct = doc% 100;
        decAfter = doc + (oct / 10) * 8;
        oct = oct % 100;
        decAfter = decAfter + oct;
        System.out.println(decAfter);

    }
}
