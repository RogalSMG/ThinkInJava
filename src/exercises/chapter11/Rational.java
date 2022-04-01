package exercises.chapter11;

public class Rational {
    private int meter;
    private int denominator;

    public Rational(int meter, int denominator) {
        this.meter = meter;
        this.denominator = denominator;
    }

    public Rational() {
        meter = 0;
        denominator = 1;
    }

    public void printRational() {
        System.out.println(meter + "/" + denominator);
    }

    public void negate() {
        meter = meter - meter * 2;
    }

    public void invert() {
        int temp = meter;
        meter = denominator;
        denominator = temp;
    }

    public double toDouble() {
        return (double) meter / denominator;
    }

    public void reduce() {
        int reducer = euklidesGCD(meter, denominator);
        meter /= reducer;
        denominator /= reducer;
    }

    public Rational add(Rational that) {
        Rational sum = new Rational();
        if (this.denominator == that.denominator) {
            sum.denominator = this.denominator;
            sum.meter = this.meter + that.meter;
        } else {
            int gcd = euklidesGCD(this.denominator, that.denominator);
            sum.denominator = lcm(this.denominator, that.denominator);
            sum.meter = (this.meter * that.denominator / gcd )+ (that.meter * this.denominator / gcd);
        }

        sum.reduce();
        return sum;
    }

    public String toString(Rational rat) {
        return meter + "/" + denominator;
    }

    /**
     * Find the greatest common divider.
     *
     * @param a first number
     * @param b second number
     * @return int
     */
    public int euklidesGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    /**
     * Find the lowest common multiplication.
     *
     * @param a first number
     * @param b second number
     * @return int
     */
    public int lcm(int a, int b) {
        return a * b / euklidesGCD(a, b);
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
