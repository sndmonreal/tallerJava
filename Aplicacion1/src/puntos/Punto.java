/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puntos;

/**
 *
 * @author Sandra
 * Creada el 27/06/2019, 11:31:45 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Punto {
    // ATRIBUTOS
    private int x;
    private int y;
    // CONSTRUCTOR
    public Punto(int n1, int n2){
        x = n1;
        y=n2;
        System.out.println("En el constructor de Punto");
    }
    public void cambiarX(int n){
        x=n;
    }
    public void cambiarY(int n){
        y=n;
    }
    public int devolverX(){
        return x;
    }
    public int devolverY(){
        return y;
    }
    public void mostrarXY(){
        System.out.println( "(" +x+ "," +y+ ")" );
    }
}
