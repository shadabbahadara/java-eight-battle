package com.khan.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateFinderApp {

    public static void main(String[] args) {
        List<String> duplicates = Arrays.asList("shadab", "khan", "shadab", "sameer", "sameer")
                .stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(duplicates);
    }
}
