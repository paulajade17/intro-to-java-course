package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    public double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate){
       this.accountNumber = accountNumber;
       this.balance = balance;
       this.interestRate = interestRate; 
    }
    public void applyInterest(){
        double calculatedInterest = (this.balance * this.interestRate);
        //this.balance = calculatedInterest + this.getBalance();
        this.deposit(calculatedInterest);

    }
    public double getInterestRate(){
        return this.interestRate;

    }
    public void setInterestRate(double newInterestRate){
        if (newInterestRate >= 0){
            this.interestRate = newInterestRate;
        }
        
    }

}
