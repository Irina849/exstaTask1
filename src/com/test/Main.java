package com.test;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String output = "Coronavirus: What we still don`t know about Covid-19"
                .chars()
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> String.format("'%s' -> %d%n", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining());
        System.out.println(output);
    }

}
