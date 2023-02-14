package com.texhnolyze.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Account timsAccout = new Account("Tim");
        timsAccout.deposit(1000);
        timsAccout.withDraw(500);
        timsAccout.withDraw(-200);
        timsAccout.deposit(-20);
        timsAccout.calculteBalance();
    //        timsAccout.balance = 5000;

        System.out.println("Balance on accout " + timsAccout.getBalance());
        //timsAccout.transactions.add(4500);
        timsAccout.calculteBalance();
    }
}
