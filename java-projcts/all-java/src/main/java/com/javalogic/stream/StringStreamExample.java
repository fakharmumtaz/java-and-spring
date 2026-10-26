package com.javalogic.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringStreamExample {
    public static void main(String[] args) {
        String text = "Hello, Java 22!";
        System.out.println("String : "+text);

        // 1. Convert to a List of Character objects
        List<Character> charList = text.chars()
                .mapToObj(c -> (char) c) // Box the int code point to Character
                .toList();               // toList() is a concise way to collect

        System.out.println("Character List: " + charList);
        System.out.println("isLetter : "+Character.isLetter(97+26));

        // 2. Filter out non-alphabetic characters and convert to uppercase
        String cleanAlphaString = text.chars()
                .filter( a -> {
                        if (Character.isLetter(a) || Character.isWhitespace(a))
                            return true;
                        else
                            return false;
                })
                .map(Character::toUpperCase)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Only Uppercase Letters: " + cleanAlphaString);

        // 3. Group and count character occurrences
        Map<Character, Long> frequencies = text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        System.out.println("Character frequencies: " + frequencies);
    }
}
