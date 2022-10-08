package homeWork5.level1;

public class Ex1A2 {
    public static void main(String[] args) {
 boolean isSunny = true;
 boolean isWindy = false;
 boolean canSwim = isSunny || !isWindy;
 System.out.println(canSwim);

 boolean isEdekaOpen = true;
 boolean isReweOren = false;
 boolean canBuy = isReweOren || isEdekaOpen;
 System.out.println("Я могу купить еду, это " + canBuy);

    }
}
