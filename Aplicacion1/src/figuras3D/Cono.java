/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package figuras3D;

/**
 *
 * @author Sandra
 * Creada el 25/06/2019, 12:47:59 PM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Cono {
    private float altura;
    private float radio;
    private float apotema;
    private final float pi=3.1416f;
    
    Cono(float a, float r){
        altura=a;
        radio=r;
    }
    
    void calcularApotema(){
        apotema = (float)Math.sqrt(radio*radio+altura*altura);
    }
     float calcularAreaL(){
        return pi*radio*apotema;
    }
    float calcularAreaT(){
         return calcularAreaL()+ pi*radio*radio;
    }
    float calcularVolumen(){
        return pi*(radio*radio)*altura;
    }

}
