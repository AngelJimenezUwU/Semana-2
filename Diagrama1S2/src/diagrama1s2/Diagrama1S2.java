/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagrama1s2;


import java.util.Scanner;
/**
 *
 * @author AnkeUwU
 */
public class Diagrama1S2 {

 
    public static void main(String[] args) {
        
     int Sel;
     
    Scanner Se = new Scanner(System.in); 
    
    Student Estudiante1 = new Student ("Leon","Leon@gmail.com","Matutino", 22 ,1500.00);
     
    Staff S1 = new Staff ("Leon ","Leon@gmail.com ","INEBE ",1500.00);
    
    
        
    System.out.println("---------Estudiantes y Staff---------\n");
    System.out.println("Seleccione la información a la que desea acceder: "+"\n");    
    System.out.println("1.Estudiantes"+"\n"+"2.Staff"+"\n");     
        
    Sel = Se.nextInt();  
        
   if (Sel == 1){    
        
     System.out.println(Estudiante1.toString());
       
       
        
        } 
        
   
   if (Sel == 2){    
        
        System.out.println(S1.toString());
       
       
        
        }    
   
   if (Sel > 2){    
        
       System.out.println("---------Fuera de Rango---------"+"\n");  
       
        }    
   
   
   
   
    }
    
}
