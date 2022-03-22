package zadania;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadania {

    public static void zadanie3_4() {
        Random random = new Random();

        int randomNumber = random.nextInt(2) + 1;
        System.out.println("think o liczbie pomiędzy 1 a 100");
        System.out.println("Zgadniesz jaka to liczba");

        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj liczbę: ");
            int guess = scan.nextInt();
            if (guess > randomNumber) {
                System.out.println("Twoja liczba jest większa od szukanej");
            } else if (guess < randomNumber) {
                System.out.println("Twoja liczba jest mniejsza od szukanej");
            } else {
                System.out.println("odgadłeś liczbę jesteś zajebisty");
                break; //return also work, I don't know why??
            }
        }
    }

    public static double multAdd(double in) {
        double a = in * Math.exp(in * -1.0) + Math.sqrt(1 - Math.exp(in * -1.0));

        return a;
    }

    public static void zadanie5_3(int a, int b, int c, int n) {
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Oh crap, fermat was wrong");
        } else {
            System.out.println("Nope, it's doesn't work");
        }
    }

    public static void fibonacciDisplayAll(int n) {
        int now = 1;
        int previous = 0;
        int next;
        for (int i = 0; i < n; i++) {
            next = now + previous;
            System.out.printf("%d ", next);
            previous = now;
            now = next;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void stringGames() {
        String sentence = "Ala has a cat";
        int i = sentence.indexOf('a');
        System.out.println(sentence.substring(i, i + 3));
    }

    public static String reverseStringUsingStringBuilder(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }
        return builder.toString();
    }

    public static String makeFirstUpperRestLower(String input) {
        input = input.toUpperCase();
        return input;
        //todo
    }

    public static void displayTimeInLoop() {
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j += 30) {
                System.out.println(displayTime(i, j));
            }
        }
    }

    public static String displayTime(int hour, int minute) {
        String AMPM;
        if (hour < 12) {
            AMPM = "AM";
        } else {
            AMPM = "PM";
            if (hour != 12) {
                hour = hour - 12;
            }
        }
        return String.format("%02d:%02d %s", hour, minute, AMPM);
    }

    public static void displayMultiplicationTable(int x, int y) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static String eachSecondCharOneNext(String input) {
        char[] charArray = input.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                charArray[i]++;
            }
            builder.append(charArray[i]);
        }
        return builder.toString();
    }

    public static void zadanie6_1(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i /= 2;
            } else {
                i++;
            }
        }
    }

    public static double zadanie6_2(double a) {
        double x0 = a / 2;
        double x1 = (x0 + a / x0) / 2;
        while (true) {
            x0 = (x1 + a / x1) / 2;
            if (Math.abs(x1 - x0) > 0.0001) {
                x1 = x0;
            } else {
                break;
            }
        }
        return x0;
    }

    public static double zadanie6_3(double x, double n) {
        double sum = 0;
        double factorial = 1;
        double plusMinus = -1;
        double base = 1;


        for (int i = 0; i < n; i++) {
            if (i > 0) {
                factorial *= i;
            }

            if (i == 0) {
                plusMinus = 1;
            } else plusMinus = plusMinus * -1;

            for (int j = 0; j < 2; j++) {
                if (i == 0) {
                    base = 1;
                } else {
                    base = base * x;
                }
                System.out.println("plus wynosi: " + base + " przy i = " + i + ", a j = " + j);
            }
            double outcome = plusMinus * base / factorial;
            sum += outcome;
            System.out.println("Outcome of n = " + (i + 1) + " equals " + outcome);
        }
        return sum;
    }

    public static boolean zadanie6_4(String input) {
        boolean isAbecedarian = true;
        input = input.toLowerCase();
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) > input.charAt(i + 1)) {
                isAbecedarian = false;
                break;
            }
        }
        return isAbecedarian;
    }

    public static boolean zadanie6_5(String input) {
        boolean isDoubloon = false;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    count++;
                }
                isDoubloon = count == 2;
            }
        }
        return isDoubloon;
        // TODO: 14/03/2022 mogłbys zrobic złozoność 0 ale nie wiem czy sie da
    }

    public static boolean zadanie6_6(String titles, String word) {
        // TODO: 14/03/2022 is possible to do without using array
        char[] chars = titles.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < titles.length(); j++) {
                if (word.charAt(i) == chars[j]) {
                    chars[j] = '0';
                    break;
                } else if (j == chars.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void randomPointsCounter(int maxPoints, int numberOfEvaluations) {
        Random ran = new Random();
        int[] scores = new int[numberOfEvaluations];
        for (int i = 0; i < numberOfEvaluations; i++) {
            scores[i] = ran.nextInt(maxPoints);
        }

        int[] counts = new int[maxPoints];
        for (int score : scores) {
            counts[score]++;
        }

        int i = 0;
        for (int count : counts) {
            System.out.println("Number of points: " + i + " occur: " + count + " times.");
            i++;

        }
        System.out.println();

    }

    public static void displayingLetterAndCount(int[] inputCounts) {

        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i) + " ");
            if (i == 25) {
                System.out.println();
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(inputCounts[i] + " ");
        }
    }

    public static void countLetterDoubloon(String input) {
        int[] counts = new int[26];
        input = input.toLowerCase();
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++;
            }
        }
        displayingLetterAndCount(counts);
    }

    public static int zadanie7_3(int[] inputArray) {
        int indexOfMax = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > inputArray[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    } //method returned index of biggest element in a list

    public static boolean[] zadanie7_4(int n) {
        boolean[] firsts = new boolean[n];
        Arrays.fill(firsts, 2, n, true);
        int prime = 2;
        for (int i = 2; i < n; i++) {
            for (int j = prime * 2; j < n; j += prime) {
                if (j % prime == 0) {
                    firsts[j] = false;
                }
            }

            for (int j = prime + 1; j < n; j++) {
                if (firsts[j]) {
                    prime = j;
                    i = prime;
                    break;
                }
            }
        }
        return firsts;
    } //method returned list of booleans which indicates if index of each array element is prime number

    public static boolean zadanie7_5(int input, int[] factors) {
        boolean areFactors = true;
        for (int factor : factors) {
            if (input % factor != 0) {
                areFactors = false;
                break;
            }
        }
        return areFactors;
    } // method check if all number in array are factors of input

    public static boolean zadanie7_6(int input, int[] factors) {
        boolean isOk = true;
        int maxFactor = factors[zadanie7_3(factors)];
        System.out.println(maxFactor);
        boolean[] primes = zadanie7_4(maxFactor + 1);

        for (int factor : factors) {
            if (!primes[factor]) return false;
        } // check if factors are prime by compare them to boolean values in primes list

        return zadanie7_5(input, factors);
    } //method check if input is divided by all factors and if all factors are prime numbers

    public static int[] zadanie7_7(String input) {
        int[] histogram = new int[26];
        input = input.toLowerCase();
        char[] chars = input.toCharArray();


        for (char ch : chars) {
            if (ch >= 'a' && ch <= 'z') {
                histogram[ch - 'a']++;
            }
        }
        return histogram;
    } //method make histogram of given input, skip polish letters and symbols

    public static boolean zadanie7_8(String input1, String input2) {
        int[] hist1 = zadanie7_7(input1);
        int[] hist2 = zadanie7_7(input2);
        return Arrays.equals(hist1, hist2);
    }

    public static int factorialDown(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorialDown(n - 1);
    }

    public static int counta(String input) {
        input = input.toLowerCase();
        int count = 0;

        if (input.length() == 0) {
            return 0;
        } else if (input.charAt(0) == 'a') {
            count = 1;
        }

        return count + counta(input.substring(1));
    }

    /**
     * Method remove letter form input
     *
     * @param input  string
     * @param letter with will be removed
     * @return String
     * @thro
     * @author Daniel
     * @version the best
     */
    public static String removeLetters(String input, char letter) {
        String result;
        if (input.length() == 0) {
            result = "";
        } else {
            char first = input.charAt(0);
            String rest = input.substring(1); //        System.out.println(input + "|" + rest);
            String recurse = removeLetters(rest, letter); //        System.out.println(recurse + "|" + rest);
            if (first == letter) {
                result = recurse;
            } else {
                result = first + recurse;
            }
        }

        return result;
    }

    public static class zadanie4_5 {
        public static void main(String[] args) {
            int bizz = 5;
            int buzz = 2;
            zoop("tylko dla", bizz);
            clink(2 * bizz);

        }

        static void clink(int fork) {
            System.out.print("To ");
            zoop("śniadanie ", fork);
        }

        protected static void zoop(String fred, final int bob) {
            System.out.println(fred);
            if (bob == 5) {
                ping("nie ");
            } else {
                System.out.println("!");
            }
        }

        private static void ping(String strang) {
            System.out.println("dowolnie " + strang + "więcej ");
        }
    }

    public static class zadanie5_6 {
        //Method getting input from user and return it if is an integer
        public static int getIntFromUser(String variable) {
            Scanner in = new Scanner(System.in);
            System.out.print("Put integer for variable " + variable + ": ");
            while (!in.hasNextInt()) {
                String word = in.next();
                System.err.println("Your input weren't integer: " + word);
            }
            return in.nextInt();
        }

        public static void main(String[] args) {
            int a = getIntFromUser("a");
            int b = getIntFromUser("b");
            int c = getIntFromUser("c");
            double x1, x2;


            double delta = b * b - (4 * a * c);

            if (a != 0) {
                if (delta > 0) {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Quadratic function has two zeros:");
                    System.out.printf("x1 = %.2f\nx2 = %.2f", x1, x2);
                } else if (delta == 0) {
                    x1 = (double) -b / (2 * a);
                    System.out.println("Quadratic function has one zero:");
                    System.out.printf("x1 = %.2f", x1);
                } else {
                    System.out.println("Quadratic function has no zeros.");
                }

            } else {
                System.out.println("Factor a can't be equal 0");
            }
        }
    }

    public static class zadanie5_7 {
        //Method getting input from user and return it if is an integer
        public static int getIntFromUser(String variable) {
            Scanner in = new Scanner(System.in);
            System.out.print("Put integer for variable " + variable + ": ");
            int side = 0;
            boolean isPositive = false;
            while (!isPositive) {
                while (!in.hasNextInt()) {
                    String word = in.next();
                    System.err.println("Your input weren't integer: " + word);
                }

                side = in.nextInt();
                if (side >= 0) {
                    isPositive = true;
                } else {
                    System.err.println("Your number must be greater than 0");
                }
            }
            return side;
        }

        public static void main(String[] args) {
            int a = getIntFromUser("a");
            int b = getIntFromUser("b");
            int c = getIntFromUser("c");
            if (a >= b + c || b >= a + c || c >= b + c) {
                System.out.println("You cant build triangle by those segments");
            } else {
                System.out.println("you can built a triangle");
            }
        }
    }

    public static class zadanie7_2 {

        public static void main(String[] args) {
            int[] bob = make(5);
            dub(bob);
            System.out.println(mus(bob));
        }

        public static int[] make(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = i + 1;
            }
            return a;
        }

        public static void dub(int[] jub) {
            for (int i = 0; i < jub.length; i++) {
                jub[i] *= 2;
            }
        }

        public static int mus(int[] zoo) {
            int fus = 0;
            for (int j : zoo) {
                fus += j;
            }
            return fus;
        }
    }

    public static class zadanie8_1 {

        public static void main(String[] args) {
            printSong(99);
        }

        public static void printSong(int n) {
            if (n == 0) {
                lastVerse();
            } else {
                verse(n);
                printSong(n - 1);
            }
        }

        public static void verse(int beers) {
            System.out.println(beers + " butelek piwa na regale,");
            System.out.println(beers + " butelek piwa,\n" +
                    "weź jedną, podaj ją dalej,");
            System.out.println(beers-1 + " butelek piwa na regale.\n");
        }

        public static void lastVerse() {
            System.out.println("No more beers");
        }

        
    }

    public static int oddSum8_2(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 1) {
            return n + oddSum8_2(n - 1);
        } else {
            return oddSum8_2(n - 1);
        }
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    public static class Exercise {

        public static void main(String[] args) {
            int result = prodShort(1, 8);
            System.out.printf("%,d",result);
        }

        public static int prod(int m, int n) {
            if (m == n) {
                return n;
            } else {
                int recurse = prod(m, n - 1);
                int result = n * recurse;
                System.out.println("n=" + n + " recurse=" + recurse + " result=" + result);
                return result;
            }
        }
        public static int prodShort(int m, int n) {
            if (m == n) {
                return n;
            } else {
                return n * prodShort(m, n - 1);
            }
        }
    }
}
