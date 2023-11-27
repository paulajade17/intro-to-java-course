package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    public double overdraftLimit;
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;

    }
    public double getOverdraftLimit(){
        return this.overdraftLimit;
    }
    public void setOverdraftLimit(double newOverdraftLimit){
        this.overdraftLimit = newOverdraftLimit;
    }


    @Override public double withdraw(double requested){
        if (requested > (this.balance + this.overdraftLimit)) {
            return 0;
        }

        this.balance = this.balance - requested;
        return requested;
    }

}
