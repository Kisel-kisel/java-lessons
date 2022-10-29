package homeWork11.level1;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {-5, 0, 27, 4789, 89, -6};
        for (int i =0;i<array.length;i++){
            if (array[i]>0){
                System.out.println("номер " + i + " значение " + array[i] + " первого положительного элемента массива.");
                break;
            }
        }
        }
}
