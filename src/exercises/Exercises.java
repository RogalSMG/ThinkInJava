package exercises;

import java.awt.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Daniel
 * @version 1.1
 */
public class Exercises {

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

    /**
     * @param in ok
     * @return double
     * @hidden nothing
     */
    public static double multAdd(double in) {
        return in * Math.exp(in * -1.0) + Math.sqrt(1 - Math.exp(in * -1.0));
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
                ping();
            } else {
                System.out.println("!");
            }
        }

        private static void ping() {
            System.out.println("dowolnie " + "nie " + "więcej ");
        }
    }

    public static void zadanie5_3(int a, int b, int c, int n) {
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Oh crap, fermat was wrong");
        } else {
            System.out.println("Nope, it's doesn't work");
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
        // TODO: 14/03/2022 mogłbys zrobic złozoność O(n) ale nie wiem czy sie da
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

    public static void displayHistogramInTable(int[] inputCounts) {

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
        displayHistogramInTable(counts);
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

    /**
     * return index of the biggest element in a list
     *
     * @param inputArray array to seek
     * @return int
     */
    public static int zadanie7_3(int[] inputArray) {
        int indexOfMax = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > inputArray[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    /**
     * method returned list of booleans which indicates if index that array element is prime number
     *
     * @param n length of array excluded
     * @return boolean[]
     */
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
    }

    /**
     * method check if all numbers in array are factors of input
     *
     * @param input   checked number
     * @param factors checked factors of input
     * @return boolean
     */
    public static boolean zadanie7_5(int input, int[] factors) {
        boolean areFactors = true;
        for (int factor : factors) {
            if (input % factor != 0) {
                areFactors = false;
                break;
            }
        }
        return areFactors;
    }

    /**
     * check if input is divided by all factors and if all factors are prime numbers
     *
     * @param input   checked number
     * @param factors hypothetical factors
     * @return boolean
     */
    public static boolean zadanie7_6(int input, int[] factors) {
        boolean isOk = true;
        int maxFactor = factors[zadanie7_3(factors)];
        System.out.println(maxFactor);
        boolean[] primes = zadanie7_4(maxFactor + 1);

        //check if factors are prime by compare them to boolean values in primes list
        for (int factor : factors) {
            if (!primes[factor]) return false;
        }
        return zadanie7_5(input, factors);
    }

    /**
     * method make histogram of given input, skip polish letters and symbols
     *
     * @param input string to make histogram
     * @return int[]
     */
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
    }

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
     * @param letter which will be removed
     * @return String
     * <p>
     * *@throws Exception Do not throw, just testing tags and javaDoc*
     * @author Daniel
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
            System.out.println(beers + " butelek piwa,\n" + "weź jedną, podaj ją dalej,");
            System.out.println(beers - 1 + " butelek piwa na regale.\n");
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

    public static class Exercise8_3 {
        public static void main(String[] args) {
            int result = prodShort(1, 8);
            System.out.printf("%,d", result);
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

    public static int ackermanEx8_4(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermanEx8_4(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ackermanEx8_4(m - 1, ackermanEx8_4(m, n - 1));
        } else {
            return 0;
        }
    }

    public static double exercise8_5(double x, int n) {
        // TODO: 22/03/2022 additional increase performance of running method when even power
        /*if (n % 2 == 0 && n != 0) {

            return x * exercise8_5(x, n - 2);
        }*/

        if (n == 0) {
            return 1;
        } else {
            return x * exercise8_5(x, n - 1);
        }
    }

    public static int Exercise8_6(int[] arr, int lowI, int highI) {
        // TODO: 22/03/2022 too difficult until now, recursion searching lowest element in array
        if (lowI == highI) {
            return arr[highI];
        }
        return 0;
    }

    public static class exercise8_7 {
        public static void main(String[] args) {
            printString("kakao");
            System.out.println("----");
            printBackward("kakao");
            System.out.println("----");
            String output = reverseString("kakao");
            System.out.println(output);
            System.out.println("----");
        }

        /**
         * Return first char of given string
         */
        public static char first(String s) {
            return s.charAt(0);
        }

        /**
         * Return all chars of given string without first one
         */
        public static String rest(String s) {
            return s.substring(1);
        }

        /**
         * Return all chars given string without first and last char
         */
        public static String middle(String s) {
            return s.substring(1, s.length() - 1);
        }

        /**
         * Return length of given string
         */
        public static int length(String s) {
            return s.length();
        }

        public static void printString(String s) {
            if (length(s) == 0) {
                System.out.print("");
            } else {
                System.out.println(first(s));
                printString(rest(s));
            }
        }

        public static void printBackward(String s) {
            if (length(s) != 0) {
                printBackward(rest(s));
                System.out.println(first(s));
            }
        }

        public static String reverseString(String s) {
            if (length(s) == 0) {
                return "";
            } else {
                return reverseString(rest(s)) + first(s);
            }
        }

        public static boolean isPalindrome(String s) {
            if (length(s) == 0 || length(s) == 1) {
                return true;
            } else if (first(s) == s.charAt(length(s) - 1)) {
                return isPalindrome(middle(s));
            } else {
                return false;
            }
        }


    }

    public static class Chapter9 {
        public static void main(String[] args) {
            System.out.println(exercise9_6("(()()(()((('/.p]}a[s//]]\"", '{'));
            char cha = '"';
            System.out.println((int) cha);
        }

        public static void exercise9_1() {
            int num = 8;
            boolean bool = true;
            char chara = 'a';
            double doub = 1.123;
            String hel = "hello";
            String empty = "";
            String s = num + empty;

            System.out.println(num + chara);
            System.out.println(chara + chara);
            System.out.println(hel + num);
            System.out.println(bool + hel);
            System.out.println(empty + num);
            System.out.println(empty + doub);
            System.out.println(chara);
            chara++;
            chara = (char) (chara + 1); // after adding one to char type it convert to int types, needed reversed projection
            System.out.println(chara);
        }

        public static void exercise9_2() {
            printTableOfFactorials(30);
        }

        public static void printTableOfFactorials(int num) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i + ": " + factorial(i));
            }
        }

        public static BigInteger factorial(int n) {
            if (n == 0) {
                return BigInteger.valueOf(-1);
            }

            BigInteger result = BigInteger.valueOf(1);
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }

        public static BigInteger pow(int x, int n) {
            if (n == 0) {
                return BigInteger.valueOf(1);
            }
            BigInteger t = pow(x, n / 2);

            if (n % 2 == 0) {
                return (BigInteger.valueOf(x).multiply(BigInteger.valueOf(x)));
            } else {
                return t.multiply(BigInteger.valueOf(x).multiply(BigInteger.valueOf(x)));
            }
        }

        //sth is wrong in this ex or i dont understand
        public static double exercise9_4(int x, int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1 || x == 0) {
                return 1;
            }
            if (n == 2) {
                return 1 + x;
            }
            double sum = 1 + x;
            double meter = x;
            double denominator = 1;
            for (int i = 2; i < n; i++) {
                meter *= x;
                denominator *= i;
                sum += meter / denominator;
                //sum += Math.pow(x, i) / (factorialDown(i));
            }
            return sum;
        }

        public static double myexp(int n) {
            double sum = 0;
            double x = Math.E;
            for (int i = 0; i < n; i++) {
                sum += Math.pow(x, i) / (factorialDown(i));
            }
            return sum;
        }

        public static void check(double x) {
            System.out.println(Math.exp(x));
        }

        /**
         * Counting number of 'br' type bracket in given string. <p>
         * Return 0 if amount of opposite brackets is equal.
         * Positive int if there are more opening brackets, if less - negative.
         *
         * @param s  given String
         * @param br type of bracket in opening form
         * @return int
         */
        public static int exercise9_6(String s, char br) {
            int count = 0;
            int diff = 1;
            if (br == '{' || br == '[') {
                diff = 2;
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == br) {
                    count++;
                } else if (c == br + diff) {
                    count--;
                }
            }
            return count;
        }
    }

    public static class Riddle {

        public static int riddle(int x, Point p) {
            x = x + 7;
            return x + p.x + p.y;
        }

        public static void main(String[] args) {
            int x = 5;
            Point blank = new Point(1, 2);

            System.out.println(riddle(x, blank));
            System.out.println(x);
            System.out.println(blank.x);
            System.out.println(blank.y);
        }

    }

    public static class Exercise10_2 {
        public static void main(String[] args) {
            Point blank = new Point(5, 8);

            Rectangle rect = new Rectangle(0, 2, 4, 4);
            Point center = findCenter(rect);

            double dist = distance(center, blank);
            System.out.println(dist);

            exercise3();
        }

        public static double distance(Point p1, Point p2) {
            int dx = p2.x - p1.x;
            int dy = p2.y - p1.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public static Point findCenter(Rectangle box) {
            int x = box.x + box.width / 2;
            int y = box.y + box.height / 2;
            return new Point(x, y);
        }

        public static void printPoint(Point p) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }

        public static void exercise3() {
            Rectangle box1 = new Rectangle(2, 4, 7, 9);
            Point p1 = findCenter(box1);
            printPoint(p1);

            box1.grow(1, 1);
            Point p2 = findCenter(box1);
            printPoint(p2);
            System.out.println(p1 == p2);
        }
    }

    public static int[] powArray(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], x);
        }
        return arr;
    }
}
