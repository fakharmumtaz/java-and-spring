package com.javalogic.stream;

public class StreamOnChar {
    public static void main(String[] args) {
        System.out.println("<<StreamOnChar>>");
        char str1[] = { 'd', 'u', 'n', 'j', 'a', 'r' };
        //Stream<Character> charStream =
        new String(str1).chars().mapToObj(c -> (char) c).forEach(System.out::print);
        System.out.println();

    }
}
