/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comunidad;
import java.io.Serializable;
import java.util.Calendar;
/**
 * @author Sandra
 * Creada el 28/06/2019, 11:47:23 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public abstract class Persona implements Serializable{
    // ATRIBUTOS
    protected String nombre;
    protected String curp;
    protected String unidad_academica;
    // CONSTRUCTOR
    public Persona(String n, String curp){
        nombre=n;
        this.curp=curp;
    }
    // METODOS
    // 
    public void cambiarNombre(String n){
        nombre=n;
    }
    public void cambiarCurp(String c){
        curp=c;
    }
    public void cambiarUnidadAcademica(String ua){
        unidad_academica=ua;
    }
    public String devolverNombre(){
        return nombre;
    }
    public String devolverCurp(){
        return curp;
    }
    public String devolverUnidadAcademica(){
        return unidad_academica;
    }
    public char obtenerSexo(){
        char s= curp.charAt(10);
        return s;
    }
    public String obtenerFechaNacimiento(){
        String a = curp.substring(4,6 );
        String m = curp.substring(6,8);
        String d = curp.substring(8, 10);
        
        String fn = d+"/"+m+"/"+a;
        
        return fn;
    }
    public int calcularEdad(){
        String fn= obtenerFechaNacimiento();
        String dat[ ]= fn.split("/");
        int a =1900+Integer.parseInt( dat[2]);
        
        Calendar cal = Calendar.getInstance();
        int aa =cal.get(Calendar.YEAR);
        
        return aa-a;
    }

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", curp=" + curp +
                ", unidad_academica=" + unidad_academica;
    }
    
}
