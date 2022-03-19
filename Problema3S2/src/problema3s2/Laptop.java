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
public class Laptop extends Computer {
    
    private String Bateria;

    public Laptop(int ID, double pulgadas, String Resolucion, String Bateria) {
        super(ID, pulgadas, Resolucion);
        this.Bateria = Bateria;
    }

    public void setBateria(String Bateria) {
        this.Bateria = Bateria;
    }
    
    @Override
    public void Printdata(){
    
    super.Printdata();
    
    System.out.println( Bateria);
        
     
    }
}
