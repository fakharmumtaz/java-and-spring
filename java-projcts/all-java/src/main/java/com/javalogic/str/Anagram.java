package com.javalogic.str;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Anagram {
    // Function to check whether two strings are anagram of each other
    static boolean areAnagram(char[] str1, char[] str2){
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same, then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    // Driver Code
    public static void main(String args[]) {
       // char str1[] = { 't', 'e', 's', 't' };  char str2[] = { 't', 't', 'e', 'w' };
        char str1[] = { 'd', 'u', 'n', 'g', 'a', 'r' };
        char str2[] = { 'g', 'a', 'r', 'd', 'u', 'n' };
        int inta[] = {1, 2, 3};
        //Stream<Character> charStream =
                new String(str1).chars().mapToObj(c -> (char) c).forEach(System.out::print);
        //System.out.println(Arrays.toString(str1) +"|"+ Arrays.toString(str2));
        //IntStream is = Stream.of(str1).flatMapToInt(IntStream::of);    is.forEach(System.out::println);
        //String collect = Arrays.stream(inta).mapToObj(a->""+a).collect(Collectors.joining(","));
        System.out.println();

        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");


        String str3 = "acbf";
        String str4 = "FBCA";

        // Creating array and storing the array returned by toCharArray() method
        char[] ch1 = str3.toLowerCase().toCharArray();
        char[] ch2 = str4.toLowerCase().toCharArray();


        Arrays.sort(ch2);
        Arrays.sort(ch2);

        if (areAnagram(ch1, ch2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");

        System.out.println(Arrays.toString(ch1) +" | "+ Arrays.toString(ch2));
    }
}
