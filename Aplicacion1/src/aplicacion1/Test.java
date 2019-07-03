/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion1;

/**
 *
 * @author Sandra
 * Creada el 24/06/2019, 01:15:55 PM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Test {
    public static void main(String []args){
        // CREAR UN OBJETO
        Math.sqrt(5);
        Circulo c1= new Circulo(5f);
        c1.cambiarRadio(-3.1f);
        float a = c1.calcularArea();
        float b = c1.calcularPerimetro();
        System.out.println("Radio: "+c1.devolverRadio());
        System.out.println("Area: "+a);
        System.out.println("Perimetro: "+b);
        
        Circulo c2 = new Circulo();
        Circulo c3 = new Circulo();
        
        Triangulo t = new Triangulo(2,6);
        t.cambiarA(5f);
        t.cambiarB(7f);
        t.calcularHipotenusa();
        System.out.println("Hipotenusa: "+t.devolverH());
        System.out.println("Area: "+t.calcularArea());
        System.out.println("Perimetro: "+t.calcularPerimetro());
        
    }
}
