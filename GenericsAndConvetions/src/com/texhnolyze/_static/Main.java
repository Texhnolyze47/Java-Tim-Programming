package com.texhnolyze._static;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2st Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3st Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    // normal class field or methods requiere a instance of the class
    // that don't actually exist until an instance has been created
    public static int multiply(int number){
        return number * multiplier;
    }

}
