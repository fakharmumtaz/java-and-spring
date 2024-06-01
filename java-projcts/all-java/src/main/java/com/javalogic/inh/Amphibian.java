package com.javalogic.inh;

public class Amphibian implements AnimalI {
    @Override
    public String getName() {
        return "Amphibian";
    }

    public static class Amphibian1 implements AnimalI {
        @Override
        public String getName() {
            return "Amphibian";
        }
    }

    public static class Demo {

        public static void main(String[]  str){
            Animal a = new Dog();
            a.showMe("...I am called from main");

            Animal b = (Animal) new Dog();
            b.showMe("... I am called from main ");

            /*Dog d = (Dog) new Animal();
            d.showMe(" ref d and obj is Animal");
            */

            AnimalI an = new Frog();
            an.getName();
        }
    }

    public static class Dog extends Animal {

        public void showMe(String str) {
            System.out.println("I am in Dog" + str);
        }
    }

    public static class Frog extends Amphibian {
        public Frog() {
            System.out.println("new Frog");
        }

        @Override
        public String getName() {
            return super.getName() + ": Frog";
        }
    }

    public static class Mammal implements AnimalI {
        @Override
        public String getName() {
            return "Mammal";
        }
    }
}