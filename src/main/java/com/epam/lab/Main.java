package com.epam.lab;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House dogHouse = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        dogHouse.enter(murzik);
        System.out.println(dogHouse);

        House catHouse = new House();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        catHouse.enter(rex);
        System.out.println(catHouse);
    }
}
