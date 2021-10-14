package com.softwareinstitute.training.murray.ben;

public class DuckBilledPlatypus extends Mammal {

    /////////////////////////////////Attributes////////////////////////////////////////



    /////////////////////////////////Constructors////////////////////////////////////////

    public DuckBilledPlatypus(String name) {
        super(name);
    }

    /////////////////////////////////Methods////////////////////////////////////////

    @Override
    public void eat(String food) {

    }

    @Override
    public DuckBilledPlatypus reproduce(Animal mother,Animal father)throws Exception{
        return new DuckBilledPlatypus("Egg");
    }

}
