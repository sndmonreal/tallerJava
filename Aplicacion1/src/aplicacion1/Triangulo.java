/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion1;

/**
 *
 * @author Sandra Creada el 25/06/2019, 09:45:12 AM Version: 1.0 Descripción:
 * Tema:
 */
public class Triangulo {

    private float a;
    private float b;
    private float h;
    
    Triangulo(float a, float b){
        this.a=a;
        this.b=b;
        calcularHipotenusa();
    }
    float calcularArea() {
        return b * a / 2;
    }

    float calcularPerimetro() {
        return a + b + h;
    }

    void calcularHipotenusa() {
        h = (float) Math.sqrt((a * a) + (b * b));
    }
    void cambiarA(float a){
        this.a=a;
    }
    void cambiarB(float b){
        this.b=b;
    }
    float devolverA(){
        return a;
    }
    float devolverB(){
        return b;
    }
    float devolverH(){
        return h;
    }
}
