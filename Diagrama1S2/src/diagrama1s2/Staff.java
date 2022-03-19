/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1s2;

/**
 *
 * @author AnkeUwU
 */
public class Staff extends Person{
    
 private String School;
 private double pay;


    public Staff(String name, String address, String School, double pay) {
        super(name, address);
        this.School = School;
        this.pay = pay;
    }

    
    public String getSchool() {
        return School;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
 
 
 @Override
    public String toString () {
    
    return getName() + "\n" + getAddress() + "\n" + School +"\n"  + "Q. " + pay ;
    
    
  }  
    
    
    
    
    
    
    
    
    
    
}
