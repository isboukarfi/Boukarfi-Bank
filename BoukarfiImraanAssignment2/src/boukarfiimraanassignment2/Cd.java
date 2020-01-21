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
public class Cd extends Account{
    private double interest;
    private int days;
    
    /**
     * constructor
     * @param number
     * @param balance
     * @param interest
     * @param days 
     */
    public Cd(int number, double balance, double interest, int days){
        super(number, balance);
        this.interest = interest;
        this.days = days;
    }
    
    @Override
    /**
     * displays account info
     * 
     */
    public void display(){
        System.out.println("***************");
        System.out.println("CD Account");
        super.display();
        System.out.println("Interest Rate: " + interest + "%");
        System.out.println("Days till eligible withdrawal: " + days);
    }
}
