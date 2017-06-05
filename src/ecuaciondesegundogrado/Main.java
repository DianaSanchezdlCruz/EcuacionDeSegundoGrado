/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecuaciondesegundogrado;

import java.util.Scanner;
import modelo.EcuacionDeSegundoGrado;

/**
 *
 * @author Sanchez de la Cruz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
       Scanner entrada=new  Scanner (System.in);
       EcuacionDeSegundoGrado ecuacion = new EcuacionDeSegundoGrado(0,0,0);
        
       double a,b,c; 
       boolean raiz;
       System.out.println("Proporcionar el valor de a:");
       a=entrada.nextDouble();
       ecuacion.setCoeficienteA(a);
       System.out.println("Proporcionar el valor de b:");
       b=entrada.nextDouble();
       ecuacion.setCoeficienteB(b);
       System.out.println("Proporcionar el valor de c");
       c=entrada.nextDouble();
       ecuacion.setCoeficienteC(c);
       
       System.out.println("Gracias por Proporcionar los valores.");
       System.out.println("El valor del Discriminante es: " + ecuacion.getDiscriminante());
       System.out.print("Esta ecuacion ");
       if (ecuacion.getNumeroDeSolucionesReales()==2)
       {
           System.out.println("tiene 2 Raices.");
           raiz=true;
       }
       else
       {
           if(ecuacion.getNumeroDeSolucionesReales()==1)
           {
               System.out.println("tienes 1 Raiz.");
               raiz=true;
           }
           else
           {
               System.out.println("no tiene Raiz.");
               raiz=false;
           }
       }
       if(raiz==true)
       {
           if(ecuacion.getNumeroDeSolucionesReales()==2)
           {
               System.out.println("Las raices de esta ecuacion son: x1=" + ecuacion.getRaiz1() + 
                                    "   x2=" + ecuacion.getRaiz2());
           }
           else
               if(ecuacion.getNumeroDeSolucionesReales()==1)
               {
                   System.out.println("La raiz de esta ecuacion es: x1=" + ecuacion.getRaiz1());
               }
       }
    }
    
}


