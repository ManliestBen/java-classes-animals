package org.example;

public class Mammal extends Animal {
    boolean standsUpright;
    public Mammal(String name, int topSpeed, boolean isEndangered, boolean standsUpright) {
        super(name, topSpeed, isEndangered);
        this.standsUpright = standsUpright;
    }
    @Override
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
    }
}
