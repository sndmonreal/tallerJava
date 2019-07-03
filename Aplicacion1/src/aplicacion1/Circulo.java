/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplicacion1;

/**
 *
 * @author Sandra
 * Creada el 24/06/2019, 01:04:57 PM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Circulo {
    // CARACTERISTICAS O ATRIBUTOS
   private final float pi = 3.1416f;
   private float radio;
    
    // CONSTRUCTOR
    Circulo(float r){
        if(r >0)
            radio = r;
    }
    Circulo(){
        
    }
    
    // COMPORTAMIENTO   O METODOS
    float calcularArea(){
        float area = pi*radio*radio;
        return area;
    }
    float calcularPerimetro(){
        float per=pi*radio*2;
        return per;
    }
    
    void cambiarRadio(float r){
        radio =Math.abs(r);
    }
    float devolverRadio(){
        return radio;
    }
}
