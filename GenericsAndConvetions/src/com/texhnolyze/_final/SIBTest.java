package com.texhnolyze._final;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest(){
        System.out.println("SIB constructor caller");
    }

    static {
        System.out.println("2nd nitialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
