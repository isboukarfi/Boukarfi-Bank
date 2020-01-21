/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Imraan Boukarfi
 */
package boukarfiimraanassignment2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isbou
 */
public class Customer extends Person {

    private ArrayList<Account> accounts;
    
    /**
     * constructor
     * @param name
     * @param id 
     */
    public Customer(String name, int id) {
        super(name, id);
        accounts = new ArrayList<>();
    }
    
    /**
     * gives access to accounts
     * @return 
     */
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    
    /**
     * adds account object to the arrayList
     * @param ac 
     */
    public void addAccount(Account ac) {
        accounts.add(ac);
    }
    
    /**
     * looks through accounts arrayList and matches the input for access of withdraw
     */
    public void getMoney() {
        //print statement
        System.out.println("Please enter the account number you wish to withdraw from.");
        
        //new scanner object
        Scanner scan = new Scanner(System.in);
        //int input created
        int i = scan.nextInt();
        
        //loops through accounts
        for (Account ac : accounts) {
            //if statement that finds specific account that matches input
            if (ac.getAccountNumber() == i) {
                //print statement
                System.out.println("How much money would you like to withdraw?");
                //calls the withdraw method
                ac.withdraw();
            }
            //if statement that executes if the ID is not found
            else if(ac.getAccountNumber() != i) {
                //print statement
                System.out.println("Invalid ID.");
            }
        }
    }
    
    /**
     * looks through accounts arrayList and matches the input for access of deposit
     */
    public void outMoney() {
        //print statement
        System.out.println("Please enter the account number you wish to deposit to.");
        
        //new scanner object
        Scanner scan = new Scanner(System.in);
        //int input created
        int i = scan.nextInt();
        
        //loops through accounts
        for (Account ac : accounts) {
            //if statement that finds specific account that matches input
            if (ac.getAccountNumber() == i) {
                //print statement
                System.out.println("How much money would you like to deposit?");
                //calls the deposit method
                ac.deposit();
            }
            //if statement that executes if the ID is not found
            else if(ac.getAccountNumber() != i) {
                //print statement
                System.out.println("Invalid ID.");
            }
        }
    }
    
    /**
     * method that calls the display method that prints account info
     */
    public void listAccounts(){
        //loops through accounts
        for (Account ac : accounts){
            //calls display() method
            ac.display();
        }
    }

}
