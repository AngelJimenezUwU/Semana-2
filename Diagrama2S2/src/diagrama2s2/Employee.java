/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama2s2;

/**
 *
 * @author AnkeUwU
 */
public class Employee {
    
  private String name;
  private int age;   
  private double salary;

  
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
  
  
  public void Printdata(){
  
  System.out.println(name + "\n" + age + "\n" + salary );
    
    }
    
    
}
