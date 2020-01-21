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
public class Bank {

    private ArrayList<Person> person;
    
    /**
     * constructor
     * 
     */
    public Bank() {
        person = new ArrayList<>();
        
        //calls the method so that the bank knows the employees
        initialEmployees();
    }
    
    /**
     * method that creates a new account
     * 
     */
    public void newAccount() {
        //print statement
        System.out.println("Are you a new customer? Enter yes or no.");
        
        //new scanner object made
        Scanner input = new Scanner(System.in);
        //new String input made
        String y = input.nextLine();
        
        //if statement that executes when input matches yes
        if (y.equals("yes")) {
            //calls newCustomer() method
            newCustomer();
            //calls addAccount() method
            addAccount();
        }
        //if statement that executes when input matches no
        if (y.equals("no")) {
            //calls addAccount() method
            addAccount();
        }

    }
    
    /**
     * initializes employees that are set for the program
     * 
     */
    public void initialEmployees() {
        //makes new employee object
        Employee jim = new Employee("Jim", 9427, "Front Desk", 50000);
        //adds object to person arrayList
        person.add(jim);
        
        //makes new employee object
        Employee stacey = new Employee("Stacey", 6651, "Manager", 70000);
        //adds object to person arrayList
        person.add(stacey);
        
        //makes new employee object
        Employee robert = new Employee("Robert", 2826, "Front Desk", 52000);
        //adds object to person arrayList
        person.add(robert);
        
        //makes new employee object
        Employee kim = new Employee("Kim", 4116, "Finance Advisor", 63000);
        //adds object to person arrayList
        person.add(kim);
    }
    
    /**
     * makes a new customer
     * 
     */
    public void newCustomer() {
        //print statement
        System.out.println("What is your name?");
        
        //new scanner object
        Scanner input = new Scanner(System.in);
        //string input made
        String cName = input.nextLine();
        
        //print statement
        System.out.println("Create a 4 digit ID.");
        //int input made
        int cId = input.nextInt();
        //makes variable that converts input to string length
        int size = Integer.toString(cId).length();
        //if statement that determines if input length is 4
        if (size == 4){
        //new customer object made that takes the inputs as parameters
        Customer a = new Customer(cName, cId);
        //adds the object to the person arrayList
        person.add(a);
        //print statement
        System.out.println("Your main account has been created.");
        }
        //if input length is not 4
        else {
            //print statement
            System.out.println("Invalid input.");
        }
    }
    
    /**
     * withdraws money from account
     * 
     */
    public void withdrawMoney() {
        //print statement
        System.out.println("Please enter your ID.");
        //new scanner object made
        Scanner in = new Scanner(System.in);
        //int input made
        int l = in.nextInt();
        //loops through person arrayList
        for (Person p : person) {
            if (p instanceof Customer) {
                //picks customers only and sees which ID is equal to the input
                if (((Customer) p).getId() == l) {
                    //print statement
                    System.out.println("Hello, " + p.getName());
                    //calls the listAccounts() method
                    ((Customer) p).listAccounts();
                    //calls the getMoney() method
                    ((Customer) p).getMoney();
                }
                //if statement executed when ID isn't found
                else if (((Customer) p).getId() != 1){
                    //print statement
                    System.out.println("Incorrect ID. You will be taken back to the menu.");
                }
            }
        }
    }
    
    /**
     * deposits money into account
     * 
     */
    public void depositMoney() {
        //print statement
        System.out.println("Please enter your ID.");
        //scanner object made
        Scanner in = new Scanner(System.in);
        //int input made
        int l = in.nextInt();
        //loops through person arrayList
        for (Person p : person) {
            if (p instanceof Customer) {
                //pulls the customer objects and sees which ID matches with the input
                if (((Customer) p).getId() == l) {
                    //print statement
                    System.out.println("Hello, " + p.getName());
                    //calls the listAccounts() method which prints account info
                    ((Customer) p).listAccounts();
                    //calls the outMoney() method which does the deposit process
                    ((Customer) p).outMoney();
                }
            }
        }
    }
    
    /**
     * searches department of employee
     * 
     */
    public void searchDepartment() {
        //print statement
        System.out.println("Please enter your ID.");
        //new scanner object made
        Scanner scan = new Scanner(System.in);
        //int input is made
        int x = scan.nextInt();
        //employee object made
        Employee e = null;
        //loops through person arrayList
        for (Person p : person) {
            if (p instanceof Employee) {
                //employee objects IDs are compared to input
                if (((Employee) p).getId() == x) {
                    //object e is set to employee in arrayList
                    e = (Employee) p;
                    //print statement
                    System.out.println("Hello, " + p.getName());
                    //print statement
                    System.out.println("Your department is " + e.getTitle());
                }
            }
        }
    }
    
    /**
     * searches salary of employee
     * 
     */
    public void checkSalary() {
        //print statement
        System.out.println("Please enter your ID.");
        //new scanner object made
        Scanner input = new Scanner(System.in);
        //int input made
        int x = input.nextInt();
        //employee object made
        Employee e = null;
        //loops through person arrayList
        for (Person p : person) {
            if (p instanceof Employee) {
                //gets employee IDs and see if equal to input
                if (((Employee) p).getId() == x) {
                    //sets e to be employee in arrayList
                    e = (Employee) p;
                    //print statement
                    System.out.println("Hello, " + p.getName());
                    //print statement
                    System.out.println("Your salary is $" + e.getSalary());
                }
            }
        }
    }
    
    /**
     * creates account and add it to the accounts arrayList
     * 
     */
    public void addAccount() {
        //print statement
        System.out.println("Please enter your ID.");
        //new scanner object made
        Scanner scan = new Scanner(System.in);
        //int input made
        int x = scan.nextInt();
        //creates customer object
        Customer cus = null;
        //loops through person arrayList
        for (Person p : person) {
            if (p instanceof Customer) {
                //selects customer objects and sees if ID is equal to input
                if (((Customer) p).getId() == x) {
                    //sets object to be the object in the arrayList
                    cus = (Customer) p;
                    
                    //print statements
                    System.out.println("Hello, " + p.getName());
                    System.out.println("What kind of account would you like to create?");
                    System.out.println("1. Checkings");
                    System.out.println("2. Savings");
                    System.out.println("3. CD");
                    
                    //int input made
                    int num = scan.nextInt();
                    
                    //switch cases that execute based on input
                    switch (num) {
                        case 1:
                                //print statement
                                System.out.println("Create a 5 digit account number.");
                                //int input made
                                int a = scan.nextInt();
                                //print statement
                                System.out.println("Create a 7 digit routing number.");
                                //int input made
                                int b = scan.nextInt();
                                //print statement
                                System.out.println("Enter a balance into the account. (Must be at least $50.00)");
                                //double input made
                                double money = scan.nextDouble();
                                //checking account object made with inputs
                                Checking cAccount = new Checking(a, money, b);
                                //adds account to account arrayList
                                cus.addAccount(cAccount);
                                //print statement
                                System.out.println("Your account has been created.");
                            break;

                        case 2:
                            //print statement
                            System.out.println("Create a 5 digit account number.");
                            //int input made
                            int w = scan.nextInt();
                            //print statement
                            System.out.println("Enter a balance into the account. (Must be at least $10.00)");
                            //double input made
                            double t = scan.nextDouble();
                            //print statement
                            System.out.println("Set a desired interest rate. (Must be less than 5%)");
                            //double input made
                            double rate = scan.nextDouble();
                            //new savings account made with input parameters
                            Saving sAccount = new Saving(w, t, rate);
                            //adds new object to account arrayList
                            cus.addAccount(sAccount);
                            //print statement
                            System.out.println("Your account has been created.");
                            break;

                        case 3:
                            //print statement
                            System.out.println("Create a 5 digit account number.");
                            //int input made
                            int d = scan.nextInt();
                            //print statement
                            System.out.println("Enter a balance into the account. (Must be at least $10.00)");
                            //double input made
                            double g = scan.nextDouble();
                            //print statement
                            System.out.println("Set a desired interest rate. (Must be less than 5%)");
                            //double input made
                            double iRate = scan.nextDouble();
                            //print statement
                            System.out.println("Set the amount of days you want the account to be restricted before allowing withdrawals. (Must be at least 30 days)");
                            //int input made
                            int day = scan.nextInt();
                            //new cd account made using the inputs as parameters
                            Cd cDAccount = new Cd(d, g, iRate, day);
                            //adds new object to account arrayList
                            cus.addAccount(cDAccount);
                            //print statement
                            System.out.println("Your account has been created.");
                            break;
                            }
                }
            }
        } 
    }
}
