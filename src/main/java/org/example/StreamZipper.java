package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamZipper {

    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> secondStream = Stream.of(7, 8, 9);

        Stream<Integer> zippedStream = zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        int minLength = Math.min(firstList.size(), secondList.size());

        Stream<T> zippedStream = IntStream.range(0, minLength)
                .boxed()
                .flatMap(i -> Stream.of(firstList.get(i), secondList.get(i)));

        return Stream.concat(zippedStream, Stream.concat(firstList.stream().skip(minLength), secondList.stream().skip(minLength)));
    }
}