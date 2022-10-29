package homeWork11.level2;
//Вывести элементы числового массива, которые больше, чем элементы, стоящие перед ними.
//        Например, дан массив [3, 9, 8, 4, 5, 1]. Следует вывести числа 9 и 5, так как перед ними стоят соответственно числа 3 и 4, которые меньше их.
public class Ex3 {
    public static void main(String[] args) {
int[] array = {23,43,5,54,64,7};
for(int i = 1;i< array.length;i++){
    int c =1;
    int b = i-c;
    if(array[i]>array[b]){
        System.out.println(array[i]);
    }
}
    }
}
