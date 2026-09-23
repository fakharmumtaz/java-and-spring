package com.javalogic.str;

import java.util.HashMap;
import java.util.stream.Stream;

public class LongestPalindrome {
    public static void main(String[] args) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        String s = "abaccccddeee";

        Stream.of(s.toCharArray()).forEach(System.out::print);
        System.out.println();

        int res = 0;
        int oddCount = 0;
        for (char ch : s.toCharArray() ){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
        System.out.println(freqMap);
    }
}
