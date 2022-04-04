package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTests {

    @Test
    void testZadanie7_8() {
        assertTrue(Exercises.zadanie7_8("narty", "tyran"));
        assertTrue(Exercises.zadanie7_8("Jan chryzostom Pasek", "Horst, szynke Pomacaj"));
        assertFalse(Exercises.zadanie7_8("Jan chryzostom Pasek", "Horst, "));
    }

    @Test
    void factorialDown() {
//        assertEquals(1,Zadania.factorialDown(0));

        assertEquals(24, Exercises.factorialDown(4));
        assertEquals(120, Exercises.factorialDown(5));
    }

    @Test
    void testFibonacci() {
        assertEquals(13, Exercises.fibonacci(6));
    }

    @Test
    void testLambda() {
        assertAll("all",
                () -> assertEquals(24, Exercises.factorialDown(4)),
                () -> assertFalse(Exercises.zadanie7_8("Jan chryzostom Pasek", "Horst, ")),
                () -> assertTrue(Exercises.zadanie7_8("Tyran", "narty, "))
        );
    }

    @Test
    void testCounta() {
        assertAll("Checking plenty words",
                () -> assertEquals(3, Exercises.counta("ssaaa")),
                () -> assertEquals(1, Exercises.counta("Danielos")),
                () -> assertEquals(3, Exercises.counta("Anakonda")),
                () -> assertEquals(0, Exercises.counta("Kombu"))
        );
    }

    @Test
    void testRemoveLetters() {
        assertAll("All",
                () -> assertEquals("supr", Exercises.removeLetters("supra", 'a')),
                () -> assertEquals("nkond", Exercises.removeLetters("anakonda", 'a')),
                () -> assertEquals("cmedy", Exercises.removeLetters("comedy", 'o'))
        );
    }

    @Test
    void testOddSum8_2() {
        assertAll("All",
                () -> assertEquals(0, Exercises.oddSum8_2(0)),
                () -> assertEquals(1, Exercises.oddSum8_2(2)),
                () -> assertEquals(25, Exercises.oddSum8_2(9)),
                () -> assertEquals(4, Exercises.oddSum8_2(3))
        );
    }

    @Test
    void testAckerman() {
        assertAll("All",
                () -> assertEquals(1, Exercises.ackermanEx8_4(0, 0)),
                () -> assertEquals(2, Exercises.ackermanEx8_4(0, 1)),
                () -> assertEquals(3, Exercises.ackermanEx8_4(0, 2)),
                () -> assertEquals(4, Exercises.ackermanEx8_4(0, 3)),
                () -> assertEquals(4, Exercises.ackermanEx8_4(1, 2)),
                () -> assertEquals(6, Exercises.ackermanEx8_4(1, 4)),
                () -> assertEquals(125, Exercises.ackermanEx8_4(3, 4)),
                () -> assertEquals(13, Exercises.ackermanEx8_4(4, 0)),
                () -> assertEquals(13, Exercises.ackermanEx8_4(4, 1))
        );
    }

    @Test
    void testExercise8_5() {
        assertAll("All",
                () -> assertEquals(1, Exercises.exercise8_5(1, 0)),
                () -> assertEquals(4, Exercises.exercise8_5(2, 2)),
                () -> assertEquals(9, Exercises.exercise8_5(3, 2)),
                () -> assertEquals(1024, Exercises.exercise8_5(2, 10)),
                () -> assertEquals(8, Exercises.exercise8_5(2, 3))
        );
    }

    @Test
    void testIsPalljndrome() {
        assertAll("All",
                () -> assertTrue(Exercises.exercise8_7.isPalindrome("")),
                () -> assertTrue(Exercises.exercise8_7.isPalindrome("a")),
                () -> assertTrue(Exercises.exercise8_7.isPalindrome("aa")),
                () -> assertTrue(Exercises.exercise8_7.isPalindrome("aba")),
                () -> assertFalse(Exercises.exercise8_7.isPalindrome("pikok")),
                () -> assertTrue(Exercises.exercise8_7.isPalindrome("kajak"))
        );
    }

    @Test
    void testExercise9_4() {
        assertAll("All",
        () -> assertEquals(0, Exercises.Chapter9.exercise9_4(0, 0)),
        () -> assertEquals(1, Exercises.Chapter9.exercise9_4(0, 1)),
        () -> assertEquals(1, Exercises.Chapter9.exercise9_4(0, 2)),
        () -> assertEquals(1, Exercises.Chapter9.exercise9_4(0, 5)),
        () -> assertEquals(0, Exercises.Chapter9.exercise9_4(1, 0)),
        () -> assertEquals(1, Exercises.Chapter9.exercise9_4(1, 1)),
        () -> assertEquals(2, Exercises.Chapter9.exercise9_4(1, 2)),
        () -> assertEquals(2.5, Exercises.Chapter9.exercise9_4(1, 3)),
        () -> assertEquals(2.66, Exercises.Chapter9.exercise9_4(1, 4), 0.01),
        () -> assertEquals(0, Exercises.Chapter9.exercise9_4(2, 0) ),
        () -> assertEquals(1, Exercises.Chapter9.exercise9_4(2, 1), 0.01),
        () -> assertEquals(3, Exercises.Chapter9.exercise9_4(2, 2), 0.01),
        () -> assertEquals(5, Exercises.Chapter9.exercise9_4(2, 3), 0.01),
        () -> assertEquals(7, Exercises.Chapter9.exercise9_4(2, 5), 0.01),
        () -> assertEquals(11, Exercises.Chapter9.exercise9_4(10, 2), 0.01),
        () -> assertEquals(61, Exercises.Chapter9.exercise9_4(10, 3), 0.01)
        );
    }
    @Test
    void testExercise9_4ImplementedMyExp() {
        assertAll("All",
                () -> assertEquals(0, Exercises.Chapter9.myexp(0)),
                () -> assertEquals(1, Exercises.Chapter9.myexp(1)),
                () -> assertEquals(1, Exercises.Chapter9.myexp(2)),
                () -> assertEquals(1, Exercises.Chapter9.myexp(5)),
                () -> assertEquals(0, Exercises.Chapter9.myexp(0)),
                () -> assertEquals(1, Exercises.Chapter9.myexp(1)),
                () -> assertEquals(2, Exercises.Chapter9.myexp(2)),
                () -> assertEquals(2.5, Exercises.Chapter9.myexp(3)),
                () -> assertEquals(2.66, Exercises.Chapter9.myexp(4), 0.01),
                () -> assertEquals(0, Exercises.Chapter9.myexp(0)),
                () -> assertEquals(1, Exercises.Chapter9.myexp(1), 0.01),
                () -> assertEquals(3, Exercises.Chapter9.myexp(2), 0.01),
                () -> assertEquals(5, Exercises.Chapter9.myexp(3), 0.01),
                () -> assertEquals(7, Exercises.Chapter9.myexp(5), 0.01),
                () -> assertEquals(11, Exercises.Chapter9.myexp(2), 0.01),
                () -> assertEquals(61, Exercises.Chapter9.myexp(3), 0.01)
        );
    }
}

