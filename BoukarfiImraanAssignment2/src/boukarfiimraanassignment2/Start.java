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
public class Start {

    public static void main(String[] args) {
        boolean run = true;
        
        //loops through the bank program
        while (run) {
            Bank bank = new Bank();
            
            //Print statements
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("    ");
            System.out.println("    Welcome to the bank!");
            System.out.println("    ");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Are you a customer or an employee?");
            
            //new Scanner made
            Scanner choice = new Scanner(System.in);
            //String input made
            String option = choice.nextLine();
            
            //if statement when customer is typed
            if (option.equals("customer")) {
                boolean go = true;
                
                //loops through customer menu until customer exits
                while (go) {
                    
                    //Print statements for menu
                    System.out.println("What would you like to do? Select the number that applies.");
                    System.out.println("1. Create an account");
                    System.out.println("2. Withdraw money");
                    System.out.println("3. Deposit money");
                    System.out.println("4. Exit bank");
                    
                    //int input made
                    int num = choice.nextInt();
                    
                    //try-catch block to catch invalid inputs
                    try {
                        
                        //cases used depending on input of user
                        switch (num) {
                            case 1:
                                
                                //case 1 selected makes newAccount() execute
                                bank.newAccount();
                                //ends at break and goes back to the customer menu
                                break;

                            case 2:
                                //case 2 selected makes withdrawMoney() execute
                                bank.withdrawMoney();
                                //ends at break and goes back to the customer menu
                                break;

                            case 3:
                                //case 3 selected makes depositMoney() execute
                                bank.depositMoney();
                                //ends at break and goes back to the customer menu
                                break;

                            case 4:
                                //print statement
                                System.out.println("Goodbye!");
                                //case 4 selected ends the while loop and brings user back to the start of the bank menu
                                go = false;
                                break;
                        }
                        
                        //if statement that triggers the exception when met
                        if (num > 4 || num < 1) {
                            throw new Exception("Invalid Input.");
                        }
                        
                        //prints out exception message
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            
            //if statement when employee is typed
            if (option.equals("employee")) {
                boolean go = true;
                
                //loops through employee menu until employee exits
                while (go) {
                    
                    //print statements for menu
                    System.out.println("What would you like to do? Select the number that applies.");
                    System.out.println("1. Check department");
                    System.out.println("2. Check salary");
                    System.out.println("3. Exit bank");
                    
                    //int input made
                    int num = choice.nextInt();
                    
                    //try-catch block to catch invalid inputs
                    try {
                        
                        //cases used depending on input of user
                        switch (num) {
                            case 1:
                                //case 1 selected causes searchDepartment() to execute
                                bank.searchDepartment();
                                //ends at break and goes back to the employee menu
                                break;

                            case 2:
                                //case 2 selected causes checkSalary() to execute
                                bank.checkSalary();
                                //ends at break and goes back to the employee menu
                                break;

                            case 3:
                                //print statement
                                System.out.println("Goodbye!");
                                //case 3 selected ends the while loop and brings user back to the start of the bank menu
                                go = false;
                                break;
                        }
                        
                        //if statement that triggers the exception when met
                        if (num > 3 || num < 1) {
                            throw new Exception("Invalid Input.");
                        }
                        
                        //prints exception message
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

            }
        }
    }
}
