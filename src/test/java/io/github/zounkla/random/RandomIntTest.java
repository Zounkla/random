package io.github.zounkla.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomIntTest {

    @Test
    void shouldGenerateNumberWithinRange() {
        for (int i = 0; i < 1000; i++) {
            int result = RandomInt.generate(1, 100);

            assertTrue(result >= 1 && result <= 100);
        }
    }

    @Test
    void shouldReturnSameNumberWhenBoundsAreEqual() {
        assertEquals(5, RandomInt.generate(5, 5));
    }

    @Test
    void shouldSupportIntegerBoundaries() {
        assertDoesNotThrow(() ->
                RandomInt.generate(
                        Integer.MIN_VALUE,
                        Integer.MAX_VALUE
                )
        );
    }

    @Test
    void shouldRejectInvalidRange() {
        assertThrows(
                IllegalArgumentException.class,
                () -> RandomInt.generate(10, 1)
        );
    }
}
