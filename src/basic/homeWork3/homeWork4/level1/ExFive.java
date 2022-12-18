package basic.homeWork3.homeWork4.level1;

public class ExFive {
    public static void main(String[] args) {
        ExFive gradus = new ExFive();
        System.out.println(gradus.cel(14));
        System.out.println(gradus.far(13));
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double cel = scanner.nextInt();
//        double far = (cel * 1.8) + 32;
//        System.out.println(far);
//
//        double farNew = scanner.nextDouble();// от чего ошибка при вводе числа с запятой?
//        double celNew = (farNew - 32) / 1.8;
//        System.out.println(celNew);
//    }
    double cel(double far){
        return (far - 32) /1.8;
    }
    double far(double cel){
        return cel * 1.8 + 32;
    }
}
