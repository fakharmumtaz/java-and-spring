package com.javalogic.generics;

import java.util.*;

class Animal2 { }

class Dog2 extends Animal2 { }

class Labrador extends Dog2 { }


/* 2️⃣ ? super E (Lower Bounded Wildcard)
Meaning: The type can be E or any of its superclasses (anything that E extends from).
Use Case: When you only write to a collection (Consumer).
Limitation: You cannot read elements as E (except Object).
Example: Writing to a list
*/
public class LowerBoundExample {
    public static void addDogs(List<? super Dog2> dogs) {
        dogs.add(new Dog2());       // Allowed ✅ (Adding a Dog is OK)
        dogs.add(new Labrador());  // Allowed ✅ (Labrador is a subclass of Dog)
        // Dog d = dogs.get(0); ❌ ERROR: Cannot read as Dog (Only Object)
        Animal2 a = (Animal2) dogs.get(0);
        System.out.println(a);
        System.out.println(dogs.get(0));
    }

    public static void main(String[] args) {
        List<Animal2> animals = new ArrayList<>();
        addDogs(animals); // Allowed: List<Animal> is a supertype of Dog
    }
}
/*
3️⃣ Key Differences: ? extends E vs ? super E
Feature	? extends E	? super E
Direction	Upper Bounded (Subtypes of E)	Lower Bounded (Supertypes of E)
Use Case	Reading elements	Writing elements
Can Add?	❌ No (except null)	✅ Yes (E and its subtypes)
Can Read?	✅ Yes (E and below)	⚠️ Limited (Only as Object)
Use ? extends E when:
✔ You only need to read elements from a collection.
✔ Example: Processing a list of elements without modifying it.
✔ Example Methods: List<? extends Number> (Read integers, doubles, etc.).

Use ? super E when:
✔ You only need to write elements to a collection.
✔ Example: Adding elements but not reading specific subtypes.
✔ Example Methods: List<? super Integer> (Store Integer or Object).

5️⃣ Bonus: PECS Principle
Producer Extends → If a method needs to produce (get values), use ? extends E.
Consumer Super → If a method needs to consume (add values), use ? super E.
👉 Mnemonic: "PECS" = Producer Extends, Consumer Super.
*/
