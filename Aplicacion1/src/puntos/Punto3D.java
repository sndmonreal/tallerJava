/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package puntos;

/**
 *
 * @author Sandra
 * Creada el 28/06/2019, 10:14:04 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Punto3D  extends Punto{
    // ATRIBUTOS
    private int z;
    
    // CONSTRUCTOR
    public Punto3D(int x, int y, int z){
        super(x,y);
        this.z=z;
        System.out.println("En el constructor de Punto3D");
    }
    public void cambiarZ(int a){
        z=a;
    }
    public int devolverZ(){
        return z;
    }
   
    public void mostrarXY(){
        super.mostrarXY();
        System.out.println( z );
    }
    public boolean equals(Object obj){
        boolean b=false;
        Punto3D p3d = (Punto3D)obj;
        if( (devolverX() == p3d.devolverX()) 
                && (devolverY()==p3d.devolverY())
                && (devolverZ()==p3d.devolverZ()))
            b=true;
        return b;
    }
    public static void main(String args[]){
        Punto3D p = new Punto3D(1,2,3);
        p.cambiarX(12);
        p.mostrarXY();
        System.out.println(p.toString());
        Punto3D p1 = new Punto3D(12,2,3);
        if( p.equals(p1))
            System.out.println("Son igualitos");
    }

}
