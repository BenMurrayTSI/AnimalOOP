package com.softwareinstitute.training.murray.ben;

public class Main {

    public static void main(String[] args) {
	    Cat myCat = new Cat();
        myCat = new Cat("Purple", "Female", "Siamese", 5, "Coconut");
        System.out.println(myCat.getColour());
        System.out.println(myCat.getSex());
        System.out.println(myCat.getBreed());
        System.out.println(myCat.getWeight());
        System.out.println(myCat.getName());

        System.out.println();

        Cat defaultCat = new Cat();
        defaultCat = new Cat();
        System.out.println(defaultCat.getColour());
        System.out.println(defaultCat.getSex());
        System.out.println(defaultCat.getBreed());
        System.out.println(defaultCat.getWeight());
        System.out.println(defaultCat.getName());
    }
}
