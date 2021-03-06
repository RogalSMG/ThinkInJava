package exercises.examples;

public class Recursion {
    int pprivate;

    public static void main(String[] args) {
        System.out.println("Metoda countdown");
        countdown(3);

        System.out.println("Metoda nLines");
        nLines(3);

        System.out.println("Metoda countup");
        countUp(3);

        System.out.println("Metoda displayBinary");
        displayBinary(23);
        System.out.println();
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Odpalamy!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void newLine() {
        System.out.println();
    }

    public static void nLines(int n) {
        if (n > 0) {
            newLine();
            nLines(n - 1);
        }
    }

    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

    public static void countUp(int n) {
        if (n == 0) {
            System.out.println("Odpalamy!");
        } else {
            countUp(n - 1);
            System.out.println(n);
        }
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

}
