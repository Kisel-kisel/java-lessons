package basic.homeWork3.homeWork11.homeWork10;
//Напечатать все четырехзначные числа,
// в записи которых нет двух одинаковых цифр.
public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                if (j != i)
                    for (int k = 1; k < 10; k++){
                        if (k != i && k != j)
                            for (int l = 1; l < 10; l++){
                                if (l != k && l != j && l !=i)
                                    System.out.println(i + "" + j + "" + k + "" + l );
                            }
                    }
            }
        }
    }
}