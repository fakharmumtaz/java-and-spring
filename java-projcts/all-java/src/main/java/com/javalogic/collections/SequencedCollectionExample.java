package com.javalogic.collections;

import java.util.*;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        // 1. Create a SequencedCollection (using ArrayList implementation)
        SequencedCollection<String> list = new ArrayList<>();

        // 2. Add elements normally
        list.add("Java");
        list.add("Python");
        System.out.println("Initial List: " + list); // [Java, Python]

        // 3. Add elements at both ends (addFirst / addLast)
        list.addFirst("C++");
        list.addLast("Rust");
        System.out.println("After additions: " + list); // [C++, Java, Python, Rust]

        // 4. Access elements from both ends (getFirst / getLast)
        System.out.println("First Element: " + list.getFirst()); // C++
        System.out.println("Last Element: " + list.getLast());   // Rust

        // 5. Get a reverse-ordered view of the collection (reversed)
        SequencedCollection<String> reversedView = list.reversed();
        System.out.println("Reversed View: " + reversedView); // [Rust, Python, Java, C++]

        // 6. Remove elements from both ends (removeFirst / removeLast)
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list); // [Java, Python]

        System.out.println("(((((((");

        List<String> list1 = new ArrayList<>();

        // 2. Add elements normally
        list1.add("Java");
        list1.add("Python");
        System.out.println("Initial List1: " + list1); // [Java, Python]

        // 3. Add elements at both ends (addFirst / addLast)
        list1.addFirst("C++");
        list1.addLast("Rust");
        System.out.println("After additions: " + list1); // [C++, Java, Python, Rust]

        // 4. Access elements from both ends (getFirst / getLast)
        System.out.println("First Element: " + list1.getFirst()); // C++
        System.out.println("Last Element: " + list1.getLast());   // Rust

        // 5. Get a reverse-ordered view of the collection (reversed)
        List<String> reversedView1 = list1.reversed();
        System.out.println("Reversed View: " + reversedView1); // [Rust, Python, Java, C++]

        // 6. Remove elements from both ends (removeFirst / removeLast)
        reversedView1.removeFirst();
        reversedView1.removeLast();
        System.out.println("After removals: " + reversedView1); // [Java, Python]

        System.out.println("______________");

        Set<String> set = new HashSet<>();

        // 2. Add elements normally
        set.add("Java");
        set.add("Python");
        System.out.println("Initial set: " + set); // [Java, Python]

        // 3. Add elements at both ends (addFirst / addLast)
        set.add("C++");
        set.add("Rust");
        System.out.println("After additions: " + set); // [C++, Java, Python, Rust]

        // 4. Access elements from both ends (getFirst / getLast)
        //System.out.println("First Element: " + set.getFirst()); // C++
        //System.out.println("Last Element: " + set.getLast());   // Rust

        // 5. Get a reverse-ordered view of the collection (reversed)
        //Set<String> reversedView2 = set reversed();
        //System.out.println("Reversed View: " + reversedView1); // [Rust, Python, Java, C++]

        // 6. Remove elements from both ends (removeFirst / removeLast)
        //reversedView1.removeFirst();
        //reversedView1.removeLast();
        //System.out.println("After removals: " + reversedView1); // [Java, Python]

        System.out.println("_____------------___");

        SequencedSet<String> set1 = new LinkedHashSet<>();

        // 2. Add elements normally
        set1.add("Java");
        set1.add("Python");
        System.out.println("Initial set1: " + set1); // [Java, Python]

        // 3. Add elements at both ends (addFirst / addLast)
        set1.addFirst("C++");
        set1.addLast("Rust");
        System.out.println("After additions: " + set1); // [C++, Java, Python, Rust]

        // 4. Access elements from both ends (getFirst / getLast)
        System.out.println("First Element: " + set1.getFirst()); // C++
        System.out.println("Last Element: " + set1.getLast());   // Rust

        // 5. Get a reverse-ordered view of the collection (reversed)
        SequencedSet<String> reversedView2 = set1.reversed();
        System.out.println("Reversed View: " + reversedView2); // [Rust, Python, Java, C++]

        // 6. Remove elements from both ends (removeFirst / removeLast)
        reversedView2.removeFirst();
        reversedView2.removeLast();
        System.out.println("After removals: " + reversedView2); // [Java, Python]

    }
}
