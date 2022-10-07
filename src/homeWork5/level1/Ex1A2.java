package homeWork5.level1;

public class Ex1A2 {
    public static void main(String[] args) {
 boolean isWeekend = true;
 boolean isRain = false;
 boolean canWalk = isWeekend || !isRain;
 System.out.println(canWalk);

 boolean isEdekaOpen = true;
 boolean isReweOren = false;
 boolean canBuy = isReweOren || isEdekaOpen;
 System.out.println("Я могу купить еду, это " + canBuy);

    }
}
