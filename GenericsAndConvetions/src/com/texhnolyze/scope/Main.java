package com.texhnolyze.scope;

public class Main {

    public static void main(String[] args) {
        String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        //System.out.println("varThree is not accessible here " + innerClass.varThree);
//        System.out.println("scopeInstance privateVar is " + scopeInstance.getVarOne());
//        System.out.println(privateVar);
//
//        scopeInstance.timeTwo();
//        System.out.println("*".repeat(50));
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timeTwo();
    }



}
