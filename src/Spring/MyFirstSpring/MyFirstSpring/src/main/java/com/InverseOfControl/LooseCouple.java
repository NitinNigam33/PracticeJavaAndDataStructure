package com.InverseOfControl;

public class LooseCouple {

    private AddSomeClass addSomeClass;

    public LooseCouple(AddSomeClass addSomeClass) {
        super();
        /*Instance of AddSomeClass is loosely Coupled*/
        this.addSomeClass = addSomeClass;
    }

    
    public LooseCouple(AddSomeClass addSomeClass, int n) {
        System.out.println("version 2");
        /*Instance of AddSomeClass is more loosely Coupled*/
        this.addSomeClass = addSomeClass.getAddSomeClass();
    }
}
