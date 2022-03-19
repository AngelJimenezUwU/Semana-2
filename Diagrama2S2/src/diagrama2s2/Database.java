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
public class Database extends Employee{
    
  private String databasetool ;

    public void setDatabasetool(String databasetool) {
        this.databasetool = databasetool;
    }
    
  @Override
     public void Printdata(){
        
        super.Printdata();
        
        System.out.println(databasetool + "\n");
        
    }
    
    
}
