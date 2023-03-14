/*Problem 2: Implement the abstract class and override the methods of the abstract class in the
provided derived classes.

Class : Account (abstract)
Members: accno, name, balance
Abstract Methods: displayBalance(), Deposite(), Withdraw()

Class: SavingAccount (inherits Account)
Members: type, interest_rate
Methods: calculateInterest(period)

Class: CurrentAccount (inherits Account)
Members: type, interest_rate
Methods: calculateInterest(period) */

import java.util.*;

abstract class Account{                           //Abstract class Account
    long accno;
    String name;
    double balance;
    
    abstract void displaybalance();
    
    abstract void Deposit(long amount);
    
    abstract void Withdraw(long amount);
}  

class SavingAccount extends Account{              //Class SavingAccount inherits Account class
    String type;
    double interest_rate;
    
    SavingAccount(long accno,String name,double balance,String type,double interest_rate){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
        this.type=type;
        this.interest_rate=interest_rate;
    }
    
    void displaybalance(){
        System.out.println("Balance: "+balance);
    }
    
    void Deposit(long amount){
        balance+=amount;
        System.out.println("Balance: "+balance);
    }
    
    void Withdraw(long amount){
        balance-=amount;
        System.out.println("Balance: "+balance);
    }
    
    void calculateInterest(int period){
        double val;
        val=(double)((double)(balance*interest_rate*period))/100;
        
        System.out.println("Interest: "+val);
    }
}

class CurrentAccount extends Account {                 //Class CurrentAccount inherits Account class
    String type;
    double interest_rate;
    
    CurrentAccount(long accno,String name,double balance,String type,double interest_rate){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
        this.type=type;
        this.interest_rate=interest_rate;
    }
    
    void displaybalance(){
        System.out.println("Balance: "+balance);
    }
    
    void Deposit(long amount){
        balance+=amount;
        System.out.println("Balance: "+balance);
    }
    
    void Withdraw(long amount){
        balance-=amount;
        System.out.println("Balance: "+balance);
    }
    
    void calculateInterest(int period){
        double val;
        val=(double)((double)(balance*interest_rate*period))/100;
        
        System.out.println("Interest: "+val);
    }
}

class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number,name,type,total amount,interest rate: ");          //Inputting account details
        long accno = sc.nextLong();
        String name = sc.nextLine();
        String type = sc.nextLine();
        double balance = sc.nextDouble();
        double roi = sc.nextDouble();
        
        SavingAccount SA=new SavingAccount(accno,name,balance,type,roi);
        
        System.out.println("Enter period: ");                    
        int period = sc.nextInt();
        
        SA.displaybalance();
        SA.calculateInterest(period);
        
        System.out.println("Enter amount to diposit: ");
        long amount = sc.nextLong();
        SA.Deposit(amount);
        
        System.out.println("Enter amount to withdraw: ");
        long wamount = sc.nextLong();
        SA.Withdraw(wamount);
    }
}