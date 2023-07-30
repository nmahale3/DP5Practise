package com.test2;

abstract class Accounts 
{
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    public Accounts(String accountNumber, String accountHoldersName, String address, double balance) 
    {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
    public abstract void deposite(double amount);

    public void display() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts 
{
    private static final double MINIMUM_BALANCE = 3000.0;

    public SavingsAccount(String accountNumber, String accountHoldersName, String address, double balance)
    {
        super(accountNumber, accountHoldersName, address, balance);
    }

    @Override
    public void withdraw(double amount) 
    {
        if ((balance - amount) >= MINIMUM_BALANCE) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
        else 
        {
            System.out.println("Insufficient balance. Minimum balance should be maintained: " + MINIMUM_BALANCE);
        }
    }

    @Override
    public void deposite(double amount) 
    {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }
}


public class Prog10 
{
    public static void main(String[] args) 
    {
        SavingsAccount savingsAcc = new SavingsAccount("87052002", "Navin", "Surat, City", 20000);
        savingsAcc.display();

        System.out.println("---------------------------------------------------------");
        savingsAcc.withdraw(2000);

        System.out.println("---------------------------------------------------------");
        savingsAcc.deposite(3000);

        System.out.println("---------------------------------------------------------");
        savingsAcc.display();
    }
}