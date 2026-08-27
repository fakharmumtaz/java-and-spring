package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveVowels {
    // this program removes vowels from a string
    public static void main(String[] args) {
        //String str = "My name is Sana and I a senior full stack architect";
        String str = "HelloWorldO";
        //str.chars().mapToObj(c -> (char) c)..collect();
        List<Character> collect = str.chars().mapToObj(c -> (char) c).filter(c -> !"aeiou".contains(("" + c).toLowerCase()))
                .collect(Collectors.toList());
        String collect1 = str.chars().mapToObj(c -> (char) c).filter(c -> !"aeiou".contains(("" + c).toLowerCase())).map(c -> String.valueOf(c))
                .collect(Collectors.joining());
        System.out.println(collect1);
        //collect.stream().collect(Collectors.joining(""));
        for(Character c : collect ){
            System.out.print(c);
        }
        System.out.println();
        List<String> nameList = Arrays.asList("Fahar", "Mumtaz", "Omar", "Anoop", "Amulya", "Aryib", "Paeharti", "Suhas", "Raj") ;
        List<String> collect2 = nameList.stream().map(o -> o.toUpperCase()).collect(Collectors.toList());
        for(String s : collect2){
            System.out.print(s);
        }
        System.out.println();
        List<String> collect3 = collect2.stream().sorted().collect(Collectors.toList());
        for(String s : collect3){
            System.out.print(s);
        }

    }
}
