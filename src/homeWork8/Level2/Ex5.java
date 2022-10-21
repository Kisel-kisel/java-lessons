package homeWork8.Level2;

public class Ex5 {
    public static void main(String[] args) {
        String number = "123123";
        int sumFirThree = 0;
        int sumSecThree = 0;
        for(int i = 0;i < number.length(); i++){
            int num = Character.getNumericValue(number.charAt(i));
            if (number.length() / 2 > i) {
                sumFirThree = sumFirThree + num;
            } else {
                sumSecThree = sumSecThree + num;
            }
        }
        if (sumFirThree == sumSecThree){
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
