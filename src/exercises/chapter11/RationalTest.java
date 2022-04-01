package exercises.chapter11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalTest {

    @Test
    void euklidesNWD() {
        Rational rat = new Rational();
        assertAll("All",
               () ->  assertEquals(4,rat.euklidesGCD(28,24)),
               () ->  assertEquals(33,rat.euklidesGCD(99,33))
        );
    }

    @Test
    void lcm() {
        Rational rat = new Rational();
        assertAll("All",
                () ->  assertEquals(24,rat.lcm(8,6)),
                () ->  assertEquals(99,rat.lcm(99,33))
        );
    }
}