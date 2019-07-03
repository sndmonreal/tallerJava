/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puntos;
import java.util.Random;
/**
 *
 * @author Sandra
 * Creada el 27/06/2019, 11:40:04 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Rectangulo {
    // ATRIBUTOS
    private Punto a,b,c,d;
    
    public Rectangulo(Punto a, Punto v,Punto f,Punto r){
        this.a = a;
        b = v;
        c=f;
        d=r;
    }
    public Rectangulo(){
        a = new Punto(0,0);
        b = new Punto(2,5);
        c = new Punto(-4,6);
        d= new Punto(7,9);
    }  
    private double calcularDistancia(Punto f, Punto g){
        //( (y2- y1)^2 + (x2-x1)^2)^0.5 
        double ys= Math.pow((g.devolverY()-f.devolverY()),2);
        double xs = Math.pow((g.devolverX()-f.devolverX()),2);
        double d = Math.sqrt((ys+xs));
        return d;
    }
    public double calcularPerimetro(){
        double perm = (calcularDistancia(a,b)+
                                calcularDistancia(b,c))*2;
        return perm;
    }
    public double calcularArea(){
        double area = (calcularDistancia(a,b)*
                                calcularDistancia(b,c));
        return area;
    }
    
    public static void main(String arfs[]){
        Punto p = new Punto(2,6);
        Punto b = new Punto(4,7);
        Punto t = new Punto(-1,5);
        Punto q = new Punto(-4,7);
        int arr[ ] = new int[10];
        
        Punto arreglo[][]= new Punto[10][10];
        
        Random rand= new Random();
        
        for(int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo[0].length;j++){
                arreglo[i][j]= new Punto(rand.nextInt(20),rand.nextInt(20));
                arreglo[i][j].mostrarXY();
             }
            System.out.println("\n");
        }
    }
}
