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
        
        int liminf=1500, limsup=2017;
       
        System.out.println("El mes es correcto: "+pedirMes());
        
        System.out.println("El año es correcto: "+pedirAnyo(liminf, limsup));      
        
        
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
    
    public static int pedirAnyo (int liminf, int limsup){
        
        Scanner tcl=new Scanner (System.in);  
        
        int anyo;
        
        do{
        
        System.out.print("Introduce un año entre 1500 y 2017: ");
        anyo=tcl.nextInt();
        
            if ((anyo<liminf)||(anyo>limsup)){
                System.out.println("Año fuera de parametros");
            }else{

            }      
        
        
        }while((anyo<liminf)||(anyo>limsup));
        
        
        return anyo;
        
        
    }
    
    
}
