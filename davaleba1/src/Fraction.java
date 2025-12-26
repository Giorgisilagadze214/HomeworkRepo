// n2
public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (!(x instanceof Fraction)) return false;
        Fraction fraction = (Fraction) x;
        return numerator * fraction.denominator ==
                fraction.numerator * denominator;
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
