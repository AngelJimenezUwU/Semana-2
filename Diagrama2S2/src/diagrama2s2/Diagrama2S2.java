/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama2s2;

import java.util.Scanner;
/**
 *
 * @author AnkeUwU
 */
public class Diagrama2S2 {

    

    public static void main(String[] args) {
      
    int sel;
    
    Scanner Se = new Scanner(System.in); 
    
    Programmer P1 = new Programmer ();
    Database D1 = new Database();
    
   P1.setName("Oscar");
   P1.setAge(22);
   P1.setSalary(1500.00);
   P1.setLanguage("Java");
   
   D1.setName("Osvaldo");
   D1.setAge(31);
   D1.setSalary(2000.00);
   D1.setDatabasetool("Mysql");
   
    System.out.println("---------Empleados y Database---------\n");
    System.out.println("Seleccione la información a la que desea acceder: "+"\n");   
    System.out.println("1.Empleados"+"\n"+"2.Database"+"\n");    
    
     sel = Se.nextInt(); 
     
        
      if (sel == 1){    
        
    
       P1.Printdata();
       
        
        }   
    
      if (sel == 2){    
        
    
       D1.Printdata();
       
        
        }   
        
       if (sel > 2){    
        
       System.out.println("---------Fuera de Rango---------"+"\n");  
       
        }    
      
      
        
    
    }
    
}
