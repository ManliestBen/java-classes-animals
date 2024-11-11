package org.example;

public class Koala extends Mammal {
    boolean isCarnivore;
    public Koala(String name, int topSpeed, boolean isEndangered, boolean standsUpright, boolean isCarnivore) {
        super(name, topSpeed, isEndangered, standsUpright);
        this.isCarnivore = isCarnivore;
    }
    public void printInfo() {
        if (isEndangered) {
            System.out.println("The " + name + " has a top speed of " + topSpeed + " and is endangered.");
        } else {
            System.out.println("The " + name + " has a top speed of " + topSpeed + " and is not endangered.");
        }
        if (standsUpright) {
            System.out.println("It stands upright.");
        } else {
            System.out.println("It does not stand upright.");
        }
        if (isCarnivore) {
            System.out.println("It eats meat.");
        } else {
            System.out.println("It does not eat meat.");
        }
    }
}
