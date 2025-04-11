package com.javalogic.generics;
/* Example of Comparator<? super E> in TreeSet
When you create a TreeSet with a Comparator, the Comparator can be for E or any of its superclasses. */

import java.util.Comparator;
import java.util.TreeSet;

class Animal {
    int age;

    //public Animal(){}
    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{age=" + age + "}";
    }
}

class Dog extends Animal {
    ///public Dog(){ super();   }
    public Dog(int age) {
        super(age);
    }
}

// Comparator for Animal (superclass of Dog)
class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a2.age, a1.age); // Descending order
    }
}

public class WildcardSuperExample {
    public static void main(String[] args) {
        TreeSet<Dog> dogSet = new TreeSet<>(new AnimalComparator());
        // AnimalComparator works because of <? super E>
        //new Dog();
        dogSet.add(new Dog(5));
        dogSet.add(new Dog(2));
        dogSet.add(new Dog(8));

        System.out.println(dogSet);
        // Output: [Animal{age=8}, Animal{age=5}, Animal{age=2}]
    }
}
/*
Why ? super E is Needed?
If Comparator<E> was used instead of Comparator<? super E>, then AnimalComparator (which compares Animal objects) would not work for TreeSet<Dog>.
? super E allows TreeSet<Dog> to accept a Comparator<Animal>.
Comparator<E>	Accepts only comparators of exactly E.
Comparator<? super E>	Accepts comparators of E or any of its superclasses. More flexible!
This is an example of PECS (Producer Extends, Consumer Super) principle:
? extends E → Used when you read values (Producer).
? super E → Used when you write values (Consumer).

* */