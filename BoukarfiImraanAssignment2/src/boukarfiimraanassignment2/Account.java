/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Imraan Boukarfi
 */
package boukarfiimraanassignment2;

import java.util.Scanner;

/**
 *
 * @author isbou
 */
public class Account {

    private int accountNumber;
    private double balance;
    
    /**
     * constructor
     * @param number
     * @param balance 
     */
    public Account(int number, double balance) {
        this.accountNumber = number;
        this.balance = balance;
    }
    
    /**
     * helps access private field
     * @return 
     */
    public int getAccountNumber(){
        return accountNumber;
    }
    
    /**
     * displays account info
     */
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    
    /**
     * decreases balance of account
     */
    public void withdraw() {
        //new scanner object made
        Scanner take = new Scanner(System.in);
        //double input made
        double i = take.nextDouble();
        
        //if statement when input is greater than balance
        if (i > balance) {
            //print statement
            System.out.println("Not enough money in the account. Withdrawal failed");
            
        //statement when if statement doesn't execute    
        } else {
            //new balance after input 
            balance = balance - i;
            //print statements
            System.out.println("Withdrawal succesful.");
            System.out.println("Your new balance is $" + balance);
        }
    }
    
    /**
     * increases balance of account
     */
    public void deposit() {
        //new scanner object made
        Scanner put = new Scanner(System.in);
        //double input made
        double i = put.nextDouble();
        
        //if statment when input is less than balance
        if (i < 0) {
            //print statement
            System.out.println("Not a valid input. Deposit failed.");
            
        //statement when if statement doesn't execute
        } else {
            //new balance after input
            balance = balance + i;
            //print statements
            System.out.println("Deposit succesful.");
            System.out.println("Your new balance is $" + balance);
        }
    }

}
