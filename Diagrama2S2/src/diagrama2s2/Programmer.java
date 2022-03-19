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
public class Programmer extends Employee{
    
private String language;

    public void setLanguage(String language) {
        this.language = language;
    }

    
    @Override
    public void Printdata(){
        
        super.Printdata();
        
        System.out.println(language +"\n");
        
    }
    
    
}
