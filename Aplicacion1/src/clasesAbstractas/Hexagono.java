/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesAbstractas;

/**
 *
 * @author Sandra
 * Creada el 1/07/2019, 11:58:53 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Hexagono  extends Figura{
        
        private float lado;
        
    public Hexagono(float lad){
        super(6);
        lado = lad;
    }
    @Override
    public double calcularArea() {
        return 3*lado*obtenerApotema();
    }

    @Override
    public double calcularPerimetro() {
        return lado*6;
    }
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    private double obtenerApotema(){
        return lado/1.15f;
    }

    @Override
    public String toString() {
        return "Hexagono{" + "apotema=" + obtenerApotema() + ", lado=" + lado + '}';
    }

    
    
}
