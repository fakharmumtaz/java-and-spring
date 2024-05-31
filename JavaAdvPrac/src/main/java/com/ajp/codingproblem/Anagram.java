package com.ajp.codingproblem;

import java.util.Arrays;

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

        System.out.println(Arrays.toString(ch1) +"|"+ Arrays.toString(ch2));
        Arrays.sort(ch2);
        Arrays.sort(ch2);

        if (areAnagram(ch1, ch2))
            System.out.println("The two strings are anagram of each other");
        else
            System.out.println("The two strings are not anagram of each other");

        System.out.println(Arrays.toString(ch1) +" | "+ Arrays.toString(ch2));
    }
}
