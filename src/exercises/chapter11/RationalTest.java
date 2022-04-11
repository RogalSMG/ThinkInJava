package exercises.chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {
    Rational rat = new Rational();
    @Test
    void testEuklidesNWD() {
        assertAll("All",
               () ->  assertEquals(4,rat.euclidesGCD(28,24)),
               () ->  assertEquals(33,rat.euclidesGCD(99,33))
        );
    }

    @Test
    void testLCM() {
        assertAll("All",
                () ->  assertEquals(24,rat.lcm(8,6)),
                () ->  assertEquals(99,rat.lcm(99,33))
        );
    }
}