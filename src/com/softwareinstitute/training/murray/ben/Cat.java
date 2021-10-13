package com.softwareinstitute.training.murray.ben;

public class Cat extends Mammal {

    /////////////////////////////////Attributes////////////////////////////////////////

    private String colour;
    private String breed;
    private int weight;
    private String sex;


    /////////////////////////////////Constructors////////////////////////////////////////

    public Cat() {
        this("Black");
    }

    public Cat(String colour) {
        this(colour, "Male");
    }

    public Cat(String colour, String sex) {
        this(colour, sex, "DSH");
    }

    public Cat(String colour, String sex, String breed) {
        this(colour, sex, breed, 4);
    }

    public Cat(String colour, String sex, String breed, int weight) {
        super("Unknown");
        this.colour = colour;
        this.sex = sex;
        this.breed = breed;
        this.weight = weight;
    }
    public Cat(String colour, String sex, String breed, int weight, String name) {
        super(name);
        this.colour = colour;
        this.sex = sex;
        this.weight = weight;
        this.breed = breed;
    }

    /////////////////////////////////Methods////////////////////////////////////////

    public void eat(String food) {
        System.out.println("I'm eating " + food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
