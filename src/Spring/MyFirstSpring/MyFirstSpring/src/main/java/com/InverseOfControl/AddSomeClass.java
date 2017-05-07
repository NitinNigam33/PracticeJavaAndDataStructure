package com.InverseOfControl;

public class AddSomeClass {

    @Override
    public String toString() {
        System.out.println("instance of this class is loaded");
        return "instance of this class is loaded";
    }

    public AddSomeClass getAddSomeClass() {
        return new AddSomeClass();
    }
}
