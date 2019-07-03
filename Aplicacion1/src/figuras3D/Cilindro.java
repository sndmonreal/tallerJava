/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuras3D;

/**
 *
 * @author Sandra
 * Creada el 25/06/2019, 12:47:47 PM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Cilindro {
    private float radio;
    private float altura;
    private final float pi=3.1416f;
    
    Cilindro(float r, float a){
        radio = r;
        altura=a;
    }
    float calcularAreaL(){
        return 2*pi*radio*altura;
    }
    float calcularAreaT(){
         return 2*pi*radio+(radio+altura);
    }
    float calcularVolumen(){
        return pi*(radio*radio)*altura;
    }
    void cambiarRadio(float r){
        radio=r;
    }
    void cambiarAltura(float a){
        altura=a;
    }
    float devolverRadio(){
        return radio;
    }
    float devolverAltura(){
        return altura;
    }
}
