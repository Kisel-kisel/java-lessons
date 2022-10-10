package homeWork4.level2;

public class Ex3 {
    double rate = 1.02;

    double dol(double eur) {
        return rate * eur;
    }

    double euro(double usd) {
        return rate * usd;
    }
}
