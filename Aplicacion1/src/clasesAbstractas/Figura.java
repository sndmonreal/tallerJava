/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesAbstractas;

/**
 *
 * @author Sandra
 * Creada el 1/07/2019, 10:36:54 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public abstract class Figura{
    // ATRIBUTO
    protected int no_lados;
    
    // CONSTRUCTOR
    public Figura(int lados){
        no_lados=lados;
    }
    // METODOS ABSTRACTOS
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    public String toString(){
        return "No de lados: "+no_lados;
    }
}
