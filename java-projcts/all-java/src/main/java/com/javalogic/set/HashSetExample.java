package com.javalogic.set;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate, will be ignored

        System.out.println(set+"\n1-----------");  // Output: [Apple, Orange, Banana] (Order not guaranteed)

        System.out.println(set.contains("Banana")+"\n2------------"); // Output: true
        set.remove("Banana");
        System.out.println(set.contains("Banana")+"\n3-----------------"); // Output: false

        Set<String> lset = new LinkedHashSet<>();

        lset.add("Apple");
        lset.add("Banana");
        lset.add("Orange");

        System.out.println(lset+"\n4---------------------"); // Output: [Apple, Banana, Orange] (Maintains insertion order)

        Set<Integer> tset = new TreeSet<>(), t = new TreeSet<>();

        tset.add(5);
        tset.add(1);
        tset.add(8);
        tset.add(3);

        System.out.println(tset+"\n5-------------"); // Output: [1, 3, 5] (Sorted order)

        // TreeSet with custom comparator for descending order
        tset = new TreeSet<>(Comparator.reverseOrder());

        tset.add(5);
        tset.add(1);
        tset.add(8);
        tset.add(3);

        System.out.println(tset); // Output: [8, 5, 3, 1]


    }
}