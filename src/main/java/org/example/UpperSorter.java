package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class UpperSorter {

    public static void main(String[] args) {
        List<String> strings = List.of("Petro", "Oleksandr", "Elena", "Katherine", "Daria", "Nicholas");
        List<String> result = uppercaseSortedDescending(strings);
        System.out.println(result);
    }

    public static List<String> uppercaseSortedDescending(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }
}