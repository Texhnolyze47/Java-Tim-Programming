package com.texhnolyze.accessmodifiers.execise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(sc.nextInt());
        x.x();
    }
}
