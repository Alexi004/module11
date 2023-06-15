package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndexNames {

    public static void main(String[] args) {
        List<String> names = List.of("Petro", "Oleksandr", "Elena", "Katherine", "Daria", "Nicholas");
        String result = formatOddIndexNames(names);
        System.out.println(result);
    }

    public static String formatOddIndexNames(List<String> names) {
        List<String> formattedNames = new ArrayList<>();
        Iterator<String> iterator = names.iterator();
        int index = 1;

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (index % 2 != 0) {
                formattedNames.add(index + ". " + name);
            }
            index++;
        }

        return String.join(", ", formattedNames);
    }
}