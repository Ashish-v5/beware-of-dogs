package com.epam.lab;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Рекс");
        Puppy randy = new Puppy("Рэнди");
        Cat barbos = new Cat("Барбос");
        Kitten murzik = new Kitten("Мурзик");

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
