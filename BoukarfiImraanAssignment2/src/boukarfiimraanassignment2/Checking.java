/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Imraan Boukarfi
 */
package boukarfiimraanassignment2;

/**
 *
 * @author isbou
 */
public class Checking extends Account{
    private int routingNumber;
    
    /**
     * constructor
     * @param number
     * @param balance
     * @param routing 
     */
    public Checking(int number, double balance, int routing){
        super(number, balance);
        routingNumber = routing;
    }
    
    /**
     * displays info for the account
     * 
     */
    @Override
    public void display(){
        System.out.println("***************");
        System.out.println("Checking Account");
        super.display();
        System.out.println("Routing Number: " + routingNumber);
    }
}
