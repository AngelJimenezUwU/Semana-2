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
public class Computer {
  
  private int ID;
  private double pulgadas;
  private String Resolucion;

  
    public Computer(int ID, double pulgadas, String Resolucion) {
        this.ID = ID;
        this.pulgadas = pulgadas;
        this.Resolucion = Resolucion;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setResolucion(String Resolucion) {
        this.Resolucion = Resolucion;
    }
  
    
  public void Printdata(){
  
      
    System.out.println(ID + "\n" + pulgadas + "\n" + Resolucion);
    
    
    
    }
    
}
