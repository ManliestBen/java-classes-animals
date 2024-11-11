package org.example;

public class Main {
    public static void main(String[] args) {
        Animal cheetah = new Animal("cheetah", 45, false);
        cheetah.printInfo();
        Animal whiteRhino = new Animal("white rhino", 25, true);
        whiteRhino.printInfo();
        Mammal chihuahua = new Mammal("chihuahua", 10, false, false);
        chihuahua.printInfo();
        Reptile python = new Reptile("python", 2, false, 0);
        python.printInfo();
        Snake kingCobra = new Snake("king cobra", 5, false, 0, true);
        kingCobra.printInfo();
        Koala koala = new Koala("koala", 1, false, false, false);
        koala.printInfo();
    }
}
