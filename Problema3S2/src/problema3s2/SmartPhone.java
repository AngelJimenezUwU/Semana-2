/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3s2;

/**
 *
 * @author AnkeUwU
 */
public class SmartPhone extends Computer {
 
   private String Camara; 

    public SmartPhone(int ID, double pulgadas, String Resolucion, String Camara) {
        super(ID, pulgadas, Resolucion);
        this.Camara = Camara;
    }

    public void setCamara(String Camara) {
        this.Camara = Camara;
    }
    
    
   @Override
    public void Printdata(){
  
    super.Printdata(); 
        
    System.out.println(Camara );
    
    
    
    }
    
    
    
    
    
    
    
    
}
