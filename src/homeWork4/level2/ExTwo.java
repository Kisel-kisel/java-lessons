package homeWork4.level2;

public class ExTwo {
    public static void main(String[] args) {
        ExTwo cal = new ExTwo();
        System.out.println(cal.minus(24,6));
        System.out.println(cal.div(24,6));
    }
    double plus (double on, double tw){
        return on + tw;
    }
    double minus (double on, double tw){
        return on - tw;
    }
    double div (double on, double tw){
        return on / tw;
    }
    double add (double on, double tw){
        return on * tw;
    }

}

