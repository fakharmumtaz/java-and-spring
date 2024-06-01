package com.javalogic.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharIdentification {
    public static void main(String[] args) {
        //figure out the duplicate characters in a string
        String name = "Faakhar Mumtaz";

        char[] nameChArr = name.toCharArray();

        System.out.println(nameChArr);

        Set<Character> charSet = new HashSet<Character>();
        //Arrays.stream(nameChArr).filter( c -> c).forEach(System.out::println);
        //Arrays.stream(nameChArr).filter(c -> !charSet.add(new Character(c))).collect(Collectors.toList());
    }
}
