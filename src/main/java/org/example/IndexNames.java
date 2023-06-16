package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexNames {

    public static void main(String[] args) {
        List<String> names = List.of("Petro", "Oleksandr", "Elena", "Katherine", "Daria", "Nicholas");
        String result = formatOddIndexNames(names);
        System.out.println(result);
    }

    public static String formatOddIndexNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
            }
}