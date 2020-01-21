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
public class Person {
    private String name;
    private int id;
    
    /**
     * constructor
     * @param name
     * @param id 
     */
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    /**
     * gives access to the name field
     * 
     * @return 
     */
    public String getName(){
        return name;
    }
    
    /**
     * gives access to the id field
     * 
     * @return 
     */
    public int getId(){
        return id;
    }
    
}
