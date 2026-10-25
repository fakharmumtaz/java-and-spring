package com.javalogic.collections;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetExample {
    public static void main(String[] args) {
        // 1. Initialize a SequencedSet using LinkedHashSet
        SequencedSet<String> set = new LinkedHashSet<>();

        // 2. Add elements (maintains insertion order)
        set.add("Java");
        set.add("Python");
        set.add("Go");
        System.out.println("Original Set: " + set); // [Java, Python, Go]

        // 3. Access elements from extremes easily
        System.out.println("First element: " + set.getFirst()); // Java
        System.out.println("Last element: " + set.getLast());   // Go

        // 4. Modify elements at the extremes
        set.addFirst("Rust"); // Adds to the absolute beginning
        set.addLast("C++");    // Adds to the absolute end
        System.out.println("After addFirst/addLast: " + set); // [Rust, Java, Python, Go, C++]

        // 5. Special Set Behavior: Re-adding an existing element as first/last
        // This shifts the position instead of ignoring it (unique to SequencedSet implementations)
        set.addLast("Java");
        System.out.println("After shifting 'Java' to last: " + set); // [Rust, Python, Go, C++, Java]

        // 6. Get a live, reverse-ordered view of the set
        SequencedSet<String> reversedSet = set.reversed();
        System.out.println("Reversed Set view: " + reversedSet); // [Java, C++, Go, Python, Rust]

        // 7. Remove elements from extremes
        set.removeFirst();
        set.removeLast();
        System.out.println("Final Set after removals: " + set); // [Python, Go, C++]
    }
}
