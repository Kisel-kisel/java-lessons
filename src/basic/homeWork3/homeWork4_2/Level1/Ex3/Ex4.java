package basic.homeWork3.homeWork4_2.Level1.Ex3;

public class Ex4 {
    int name(int first,short second){
        return first + second;
    }
    long name(long first,int second){
        return first + second;
    }
    double name(double first,short second){
        return first + second;
    }
    long name(long first, short second){
        return first + second;
    }
    double name(long first,double second){
        return first + second;
    }

    public static void main(String[] args) {
        Ex4 some=new Ex4();
        System.out.println(some.name(5,4));
    }
}
