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
public class Saving extends Account{
    private double interest;
    
    /**
     * constructor
     * @param number
     * @param balance
     * @param interest 
     */
    public Saving(int number, double balance, double interest){
        super(number, balance);
        this.interest = interest;
    }
    
    /**
     * helps access private field
     * 
     * @return 
     */
    public double getInterest(){
        return interest;
    }
    
    /**
     * displays account info
     * 
     */
    @Override
    public void display(){
        System.out.println("***************");
        System.out.println("Savings Account");
        super.display();
        System.out.println("Interest Rate: " + interest + "%");
    }
}
