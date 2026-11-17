package io.github.zounkla.random;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Utility class for generating random integers.
 */
public final class RandomInt {

    private RandomInt() {
        // Prevent instantiation
    }

    /**
     * Generates a random integer between min and max (inclusive).
     *
     * @param min minimum value (inclusive)
     * @param max maximum value (inclusive)
     * @return generated random integer
     * @throws IllegalArgumentException if min is greater than max
     */
    public static int generate(int min, int max) {

        if (min > max) {
            throw new IllegalArgumentException(
                    "min cannot be greater than max"
            );
        }

        return (int) ThreadLocalRandom.current()
                .nextLong(min, (long) max + 1);
    }
}