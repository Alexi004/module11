package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedNumbers {

    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = sortedNumbers(array);
        System.out.println(result);
    }

    public static String sortedNumbers(String[] array) {
        String merged = Arrays.stream(array)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .collect(Collectors.joining(", "));

        String[] numbersArray = merged.split(", ");
        Arrays.sort(numbersArray);

        return String.join(", ", numbersArray);
    }
}
