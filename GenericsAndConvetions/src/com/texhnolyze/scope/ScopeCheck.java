package com.texhnolyze.scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": private = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timeTwo (){
        int privateVar = 2;
        for (int i = 0; i < 10; i++) {
            //para decirle a java que debe usar la variable de la clase debemos utlizar this
            System.out.println(i + " times two is " + i * this.varOne);
        }


}

    public void useInner(){
        InnerClass innerClass =new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);

    }


    public class InnerClass{
        private int varThree = 3;

        public InnerClass(){
            System.out.println("InnerClass created, varOne is " + varOne + " an varThree is" + varThree);
        }

        public void timeTwo (){
            System.out.println("varOne is still available hereL" + varOne);
            for (int i = 0; i < 10; i++) {
                //para decirle a java que debe usar la variable de la clase debemos utlizar this

                System.out.println(i + " times two is " + i * varThree);
                //System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);

            }

        }
    }
}
