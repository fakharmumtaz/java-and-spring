package com.javalogic.misc;

public class MiscTests {
    public static void main(String[] args) {
        Object obj = new Triangle(); // Or any object
        Circle obj1 = new Triangle(); // Or any object
        switch (obj) {
            case Triangle t -> System.out.println("It's a triangle"); // Matches Triangle
            case Circle c -> System.out.println("It's a circle"); // Matches Circle
            default -> System.out.println("It's an unknown shape");
        }

        MiscTests.printObject("abc");
        MiscTests.printObject(454);
        MiscTests.printObject(4.2);
        MiscTests.printObject(new Circle());
        MiscTests.printObject(new Rectangle());

        MiscTests.checkNumber(454);
        MiscTests.checkNumber(-44);
    }

    public static void printObject(Object obj) {
        switch (obj) {
            case String s -> System.out.println("String: " + s);
            case Integer i -> System.out.println("Integer: " + i);
            case Double d -> System.out.println("Double: " + d);
            case Circle c -> System.out.println("It's a circle"); // Matches Circle
            default -> System.out.println("Unknown type");
        }
    }

    public static void checkNumber(Object obj) {
        switch (obj) {
            case Integer i when i > 0 -> System.out.println("Positive integer: " + i);
            case Integer i when i < 0 -> System.out.println("Negative integer: " + i);
            case Integer i -> System.out.println("Zero: " + i);
            default -> System.out.println("Not an integer");
        }
    }
}

class Circle {
}
class Triangle extends Circle  {
}
class Rectangle {
}

