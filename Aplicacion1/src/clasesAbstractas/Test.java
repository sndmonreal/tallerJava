/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesAbstractas;

/**
 *
 * @author Sandra
 * Creada el 1/07/2019, 11:31:57 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Test {
    public static void main(String args[]){
        Trapecio t1 = new Trapecio(9,5,4);
        System.out.println(t1.toString());
        System.out.println("Area= "+t1.calcularArea());
        System.out.println("Perimetro= "+t1.calcularPerimetro());
   
        Figura f = new Trapecio(7,3,3);
        System.out.println(f.toString());
        
        System.out.println(t1.igual(f));
        System.out.println(t1.mayorQue(f));
        System.out.println(t1.menorQue(f));
    }
}
