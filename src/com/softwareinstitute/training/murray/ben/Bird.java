package com.softwareinstitute.training.murray.ben;

public abstract class Bird extends Animal{

    /////////////////////////////////Attributes////////////////////////////////////////



    /////////////////////////////////Constructors////////////////////////////////////////

    public Bird(String name) {
        super(name);
    }

    /////////////////////////////////Methods////////////////////////////////////////

    @Override
    public void breathe() {

    }

    @Override
    public Animal reproduce(Animal mother, Animal father) throws Exception {
        return null;
    }

}
