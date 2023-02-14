package com.texhnolyze._static;

public class StaticTest {
    //The static fields are associated with the class so
    //when you call it remember its last state
    private static int numInstances = 0;
    //The nonstatic fields are associated with the instance
    //When create a new instante, the field start with value of
    //of initial state
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
