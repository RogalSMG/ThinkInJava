package zadania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZadaniaTest {

    @Test
    void testZadanie7_8() {
        assertTrue(Zadania.zadanie7_8("narty", "tyran"));
        assertTrue(Zadania.zadanie7_8("Jan chryzostom Pasek", "Horst, szynke Pomacaj"));
        assertFalse(Zadania.zadanie7_8("Jan chryzostom Pasek", "Horst, "));
    }

    @Test
    void factorialDown() {
//        assertEquals(1,Zadania.factorialDown(0));

        assertEquals(24, Zadania.factorialDown(4));
        assertEquals(120, Zadania.factorialDown(5));
    }

    @Test
    void testFibonacci() {
        assertEquals(13, Zadania.fibonacci(6));
    }

    @Test
    void testLambda() {
        assertAll("all",
                () -> assertEquals(24, Zadania.factorialDown(4)),
                () -> assertFalse(Zadania.zadanie7_8("Jan chryzostom Pasek", "Horst, ")),
                () -> assertTrue(Zadania.zadanie7_8("Tyran", "narty, "))
        );
    }

    @Test
    void counta() {
        assertAll("Checking plenty words",
                () -> assertEquals(3, Zadania.counta("ssaaa")),
                () -> assertEquals(1, Zadania.counta("Danielos")),
                () -> assertEquals(3, Zadania.counta("Anakonda")),
                () -> assertEquals(0, Zadania.counta("Kombu"))
        );
    }

    @Test
    void testRemoveLetters() {
        assertAll("All",
                () -> assertEquals("supr", Zadania.removeLetters("supra", 'a')),
                () -> assertEquals("nkond", Zadania.removeLetters("anakonda", 'a')),
                () -> assertEquals("cmedy", Zadania.removeLetters("comedy", 'o'))
        );
    }

    @Test
    void testOddSum8_2() {
        assertAll("All",
                () -> assertEquals(0, Zadania.oddSum8_2(0)),
                () -> assertEquals(1, Zadania.oddSum8_2(2)),
                () -> assertEquals(25, Zadania.oddSum8_2(9)),
                () -> assertEquals(4, Zadania.oddSum8_2(3))
        );
    }

    @Test
    void testAckerman() {
        assertAll("All",
                () -> assertEquals(1, Zadania.ackermanEx8_4(0, 0)),
                () -> assertEquals(2, Zadania.ackermanEx8_4(0, 1)),
                () -> assertEquals(3, Zadania.ackermanEx8_4(0, 2)),
                () -> assertEquals(4, Zadania.ackermanEx8_4(0, 3)),
                () -> assertEquals(4, Zadania.ackermanEx8_4(1, 2)),
                () -> assertEquals(6, Zadania.ackermanEx8_4(1, 4)),
                () -> assertEquals(125, Zadania.ackermanEx8_4(3, 4)),
                () -> assertEquals(13, Zadania.ackermanEx8_4(4, 0)),
                () -> assertEquals(13, Zadania.ackermanEx8_4(4, 1))
        );
    }
}

