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
public class Employee extends Person{
    private String title;
    private int salary;
    
    /**
     * constructor
     * @param name
     * @param id
     * @param title
     * @param salary 
     */
    public Employee(String name, int id, String title, int salary){
        super(name, id);
        this.title = title;
        this.salary = salary;
    }
    
    /**
     * gives access to the title field
     * 
     * @return 
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * gives access to the salary field
     * 
     * @return 
     */
    public int getSalary(){
        return salary;
    }
    
}
