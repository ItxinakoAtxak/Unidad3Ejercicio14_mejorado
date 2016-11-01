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
        int mes=pedirMes();
        int anyo=pedirAnyo(liminf, limsup);
       
        System.out.println("El MES es correcto: "+mes);
        
        System.out.println("El AÑO es correcto: "+anyo);      
        
        pedirDia(mes, anyo);
        
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
    
    public static void pedirDia (int mes, int anyo){
        
        Scanner tcl=new Scanner (System.in);
        
        int dia;
        
        
       
            System.out.print("Introduce dia: ");
            dia=tcl.nextInt();
        
        
            if((esBisiesto(anyo))&&(mes==2)){
                if((dia<0)||(dia>29)){
                    System.out.println("El dia es incorrecto");

                }else{
                    System.out.println("Fecha actual: "+dia+"/"+mes+"/"+anyo+" año bisiesto");
                }


            }else{
                if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
                    if((dia<0)||(dia>31)){
                        System.out.println("El dia es incorrecto");
                    }else{
                        System.out.println("Fecha actual: "+dia+"/"+mes+"/"+anyo);
                    }
                    
                }else if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
                    if((dia<0)||(dia>30)){
                        System.out.println("El dia es incorrecto");
                    }else{
                        System.out.println("Fecha actual: "+dia+"/"+mes+"/"+anyo);
                    }
                    
                }else{
                    if((dia<0)||(dia>28)){
                        System.out.println("El dia es incorrecto");
                    }else{
                        System.out.println("Fecha actual: "+dia+"/"+mes+"/"+anyo);
                    }
                    
                }

            }
        
        
        
        
        
        
    }
    
     public static boolean esBisiesto (int anyo){
        
        int ope, ope2, ope3;
        
        ope=anyo%4;
        ope2=anyo%100;
        ope3=anyo%400;
                
        if((ope==0)&&(ope2!=0)||(ope3==0)){
            return true;
        }else{
            return false;
        }
        
    }
}
