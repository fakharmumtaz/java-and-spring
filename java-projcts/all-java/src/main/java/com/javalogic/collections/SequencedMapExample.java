package com.javalogic.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class SequencedMapExample {
    public static void main(String[] args) {
        // LinkedHashMap now implements SequencedMap in Java 21
        SequencedMap<String, Integer> map = new LinkedHashMap<>();

        // 1. Regular insertions (Encounter order: Alice -> Bob -> Charlie)
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println("Original Map: " + map);
        // Output: {Alice=25, Bob=30, Charlie=35}

        // 2. Accessing elements from both ends
        Map.Entry<String, Integer> first = map.firstEntry();
        Map.Entry<String, Integer> last = map.lastEntry();
        System.out.println("First Entry: " + first); // Alice=25
        System.out.println("Last Entry: " + last);   // Charlie=35

        // 3. Mutating the sequence explicitly
        map.putFirst("Zoe", 50); // Adds or moves to the front
        map.putLast("Dan", 26);  // Adds or moves to the back
        System.out.println("After putFirst/putLast: " + map);
        // Output: {Zoe=20, Alice=25, Bob=30, Charlie=35, Dan=40}

        // 4. Retrieving a live, reversed-order view
        SequencedMap<String, Integer> reversedView = map.reversed();
        System.out.println("Reversed View: " + reversedView);
        // Output: {Dan=40, Charlie=35, Bob=30, Alice=25, Zoe=20}

        // 5. Polling elements (retrieving and removing)
        Map.Entry<String, Integer> polledFirst = map.pollFirstEntry();
        System.out.println("Polled First: " + polledFirst); // Zoe=20
        System.out.println("Map after polling: " + map);
        // Output: {Alice=25, Bob=30, Charlie=35, Dan=40}
    }
}
