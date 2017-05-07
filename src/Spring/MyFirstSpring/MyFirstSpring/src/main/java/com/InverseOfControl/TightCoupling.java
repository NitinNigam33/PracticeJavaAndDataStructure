package com.InverseOfControl;

public class TightCoupling {

    AddSomeClass addSomeClass;

    public TightCoupling() {
        /*Instance of AddSomeClass is tighly Coupled*/
        this.addSomeClass = new AddSomeClass();
    }
}
