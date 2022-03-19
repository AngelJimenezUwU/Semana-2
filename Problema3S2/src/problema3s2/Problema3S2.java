/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3s2;

 import java.util.Scanner;
/**
 *
 * @author AnkeUwU
 */
public class Problema3S2 {

    
    
    
    
    public static void main(String[] args) {

    int Sel;
     
    Scanner Se = new Scanner(System.in);   
        
    Laptop L1 = new Laptop (1234, 22.2,"1920*1080","1500MhA");    
        
    SmartPhone S1 = new SmartPhone (5678, 10,"1920*1080","55 MegaPixeles");   
        
        
    System.out.println("---------Venta de Accesorios Electronicos---------\n");
    System.out.println("Seleccione la información de los productos que desea conocer: "+"\n");    
    System.out.println("1.Laptops"+"\n"+"2.SmartPhones"+"\n");     
        
    Sel = Se.nextInt();     
    
     if (Sel == 1){    
        
       
         L1.Printdata();
       
       
       
        } 
        
   
   if (Sel == 2){    
        
        S1.Printdata();
       
       
        
        }    
   
   if (Sel > 2){    
        
       System.out.println("---------Fuera de Rango---------"+"\n");  
       
        }    
    
    
    
    
    
        
    }
    
}
