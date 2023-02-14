package com.texhnolyze._final;

public class SomeClass {
    public final int instanceNumber;
    private static int classCounter = 0;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance");
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
