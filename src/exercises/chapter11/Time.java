package exercises.chapter11;

/**
 * Reprezentuje czas w ciągu dnia.
 */
public class Time {

    private int hour;
    private int minute;
    private double second;

    /**
     * Konstruuje obiekt klasy Time ze standardowymi wartościami.
     */
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    /* Code to test in main

        Time time1 = new Time(10,30,35.5);
        Time time2 = new Time(10,30,35.5);
        System.out.print(time1);
        time1 = time1.add(time2);
        System.out.print(time1);
        time1.increment(3729+3600);
        System.out.print(time1);
     */

    /**
     * Konstruuje obiekt klasy Time z podanymi wartościami.
     */
    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * Wyświetla czas, korzystając z prostego formatu.
     */
    public static void printTime(Time t) {
        System.out.print(t.hour);
        System.out.print(":");
        System.out.println(t.minute);
        System.out.print(":");
        System.out.println(t.second);
    }

    /**
     * Zwraca tekstową reprezentację czasu w postaci obiektu klasy String.
     */
    public String toString() {
        return String.format("%02d:%02d:%04.1f\n",
                this.hour, this.minute, this.second);
    }
    public String toStringSuper() {
        return super.toString();
    }

    /**
     * Sprawdza, czy dwa czasy są sobie równe.
     */
    public boolean equals(Time that) {
        return this.hour == that.hour
                && this.minute == that.minute
                && this.second == that.second;
    }

    /**
     * Dodaje dwa obiekty klasy Time i zwraca nowy obiekt klasy Time (metoda statyczna).
     */
    public static Time add(Time t1, Time t2) {
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;
        return sum;
    }

    /**
     * Dodaje dwa obiekty klasy Time i zwraca nowy obiekt klasy Time (metoda instancji).
     */
    public Time add(Time t2) {
        Time sum = new Time();
        sum.hour = this.hour + t2.hour;
        sum.minute = this.minute + t2.minute;
        sum.second = this.second + t2.second;
        if (sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if (sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }
        return sum;
    }

    /**
     * Dodaje podaną liczbę sekund do obiektu this (modyfikator).
     */
    public void increment(double seconds) {
        this.second += seconds;

        if (this.second >= 60) {
            double rest = this.second % 60.0;
            int minutes = (int) this.second / 60;
            this.second = rest;
            this.minute += minutes;
        }

        if (this.minute >= 60) {
            int rest = this.minute % 60;
            int hours = this.minute / 60;
            this.minute = rest;
            this.hour += hours;
        }
    }
}
