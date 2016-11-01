/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3ejercicio14_mejorado;

import java.util.Scanner;

/**
 *
 * @author Jon Ander
 */


        
public class Unidad3Ejercicio14_mejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("El mes es correcto: "+pedirMes());
        
        // a ver como se sigue esto       
        
        
    }
    
    public static int pedirMes (){
        
        Scanner tcl=new Scanner (System.in);   
        
        int mes;
        
        do{

        System.out.print("Introduce un mes: ");
        mes=tcl.nextInt();
        
        if ((mes>12)||(mes<0)){
            System.out.println("Mes incorrecto, el mes tiene que ser entre 1 y 12");
        }else{
            
        }
            
       
        }while((mes>12)||(mes<0));
       

        return mes;
     
    }
    
    
}
