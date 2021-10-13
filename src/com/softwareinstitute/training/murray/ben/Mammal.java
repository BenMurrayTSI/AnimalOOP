package com.softwareinstitute.training.murray.ben;

public abstract class Mammal extends Animal {

    /////////////////////////////////Attributes////////////////////////////////////////



    /////////////////////////////////Constructors////////////////////////////////////////

    public Mammal(String name) {
        super(name);
    }

    /////////////////////////////////Methods////////////////////////////////////////

    public Mammal reproduce(Animal mother, Animal father) throws Exception {
        return (Mammal)Class.forName(this.getClass().toString()).newInstance();
    }

    public void breathe(){
        System.out.println("Huff and a Puff.");
    }

}
