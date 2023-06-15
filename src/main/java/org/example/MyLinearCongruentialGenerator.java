package org.example;

import java.util.stream.Stream;

public class MyLinearCongruentialGenerator {

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = randomNumberStream(a, c, m);
        randomStream.limit(10).forEach(System.out::println);
    }

    public static Stream<Long> randomNumberStream(long a, long c, long m) {
        final long seed = System.currentTimeMillis();
        final long[] currentSeed = {seed};

        return Stream.generate(() -> {
            currentSeed[0] = (a * currentSeed[0] + c) % m;
            return currentSeed[0];
        });
    }
}