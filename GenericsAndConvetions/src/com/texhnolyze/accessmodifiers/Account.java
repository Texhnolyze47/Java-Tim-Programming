package com.texhnolyze.accessmodifiers;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;


    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }


    public void deposit(int amaout){
        if(amaout > 0){
            transactions.add(amaout);
            this.balance += amaout;
            System.out.println(amaout + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withDraw(int amout){
        int withDrawal = -amout;
        if (withDrawal < 0){
            this.transactions.add(withDrawal);
            this.balance += withDrawal;
            System.out.println(amout + "withdraw. Balance is now" + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sum");
        }
    }

    public void calculteBalance(){
        this.balance = 0;
        for (int i : this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
