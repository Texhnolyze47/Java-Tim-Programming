package com.texhnolyze.accessmodifiers.execise;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
    }

    public void x(){
        for (int x = 0; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
