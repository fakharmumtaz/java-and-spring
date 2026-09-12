package com.javalogic.generics;

import java.util.*;

class Animal1 {
    void makeSound() { System.out.println("Animal sound"); }
}

class Dog1 extends Animal1 {
    void makeSound() { System.out.println("Woof!"); }
}

class Labrador1 extends Dog1 {
    void makeSound() { System.out.println("Labr!"); }
}

/*
1️⃣ ? extends E (Upper Bounded Wildcard)
🔹 Meaning: The type can be E or any of its subclasses (anything that extends E).
🔹 Use Case: When you only read from a collection (Producer).
🔹 Limitation: You cannot add elements (except null).
Example: Reading from a list
* */
public class UpperBoundExample {
    public static void makeAnimalsSound(List<? extends Animal1> animals) {
        for (Animal1 a : animals) {
            a.makeSound(); // Allowed ✅ (Reading is OK)
        }
        // animals.add(new Dog1()); ❌ ERROR: Cannot add new elements
    }

    public static void main(String[] args) {
        List<Animal1> dogs = Arrays.asList(new Animal1(), new Dog1(), new Dog1(), new Labrador1());
        //dogs.add(new Dog1());
        makeAnimalsSound(dogs);
        //dogs.add(new Dog1());
    }
}
