/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sanchez de la Cruz
 */
public class EcuacionDeSegundoGrado {
    private double a,b,c;
    private double discriminante,resultado,numeroDeSoluciones,raiz1,raiz2;
    
    public EcuacionDeSegundoGrado (double a,double b, double c)
    {
        this.a=0;
        this.b=0;
        this.c=0;
    }
    
    public double getCoeficienteA()
    {
        return a;
    }
    public double getCoeficienteB ()
    {
        return b;
    }
    public double getCoeficienteC()
    {
        return c;
    }
    
    public void setCoeficienteA(double a)
    {
        this.a=a;
    }
    public void setCoeficienteB(double b)
    {
        this.b=b;
    }
    public void setCoeficienteC(double c)
    {
        this.c = c;
    }
    
    public double getDiscriminante()
    {
        resultado= Math.pow(b,2);
        discriminante=resultado - ((4*a)*(c));
        return discriminante;
    }
    
    public double getNumeroDeSolucionesReales()
    {
        if(discriminante>0)
        {
            numeroDeSoluciones=2;
        }
        else
        {
            if(discriminante==0)
            {
                numeroDeSoluciones=1;
            }
            else
            {
                numeroDeSoluciones=0;
            }
        }
        return numeroDeSoluciones;
    }
    
    public double getRaiz1()
    {
        raiz1=(-b + Math.sqrt(resultado- (4*(a)*(c))))/(2*a);
        return raiz1;
    }
    public double getRaiz2()
    {
        raiz2=(-b - Math.sqrt(resultado- (4*(a)*(c))))/(2*a);
        return raiz2;
    }
    
}


