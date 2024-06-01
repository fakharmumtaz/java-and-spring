package com.javalogic.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamEx {

    public static void main(String[] args) {
        String temp = "String is in double quotes. Special Chars are #$%^&";
        IntStream intStream = temp.chars();
        Set<Integer> iSet = new HashSet<>();
        //intStream.filter(c -> iSet.add(c)).collect(Collectors.toList());
    }
}
