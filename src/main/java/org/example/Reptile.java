package org.example;

public class Reptile extends Animal {
    int numLegs;
    public Reptile (String name, int topSpeed, boolean isEndangered, int numLegs) {
        super(name, topSpeed, isEndangered);
        this.numLegs = numLegs;
    }
    @Override
    public void printInfo() {
        if (isEndangered) {
            System.out.println("The " + name + " has " + numLegs + " legs, a top speed of " + topSpeed + " and is endangered.");
        } else {
            System.out.println("The " + name + " has " + numLegs + " legs, a top speed of " + topSpeed + " and is not endangered.");
        }
    }
}
