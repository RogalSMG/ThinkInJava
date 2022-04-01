import exercises.Exercises;
import exercises.chapter11.Rational;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 7, 5};
        Rational rational = new Rational();
        rational.printRational();
        System.out.println(rational);
        rational.setMeter(5);

        rational.printRational();
        rational.negate();
        rational.printRational();
        System.out.println(rational.toDouble());
        rational.setDenominator(3);
        System.out.println(rational.toDouble());
        System.out.println("----");
        rational.invert();
        rational.printRational();
        System.out.println(rational.toDouble());
        rational.negate();
        System.out.println(rational.toDouble());
        System.out.println("----");
        rational.setMeter(4);
        rational.setDenominator(8);
        rational.printRational();
        Rational rational1 = new Rational(3,6);
        rational = rational.add(rational1);
        rational.printRational();




//        int[] histrogram = Exercises.zadanie7_7("baba poszła do komina");
//        Exercises.displayHistogramInTable(histrogram);

//        boolean areAnagrams = Zadania.zadanie7_8("tyraN","narty");
//        System.out.println(areAnagrams);
    }
}
