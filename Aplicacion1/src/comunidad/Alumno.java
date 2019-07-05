/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comunidad;

/**
 *
 * @author Sandra
 * Creada el 28/06/2019, 01:31:29 PM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Alumno extends Persona{
    private int no_boleta;
    private String programa;
    private String situacion_academica;
    
    public Alumno(String nombre, String curp, int nb){
        super(nombre,curp);
        no_boleta=nb;
    }
    public void cambiarNoBoleta(int n){
        no_boleta=n;
    }
    public void cambiarPrograma(String a){
        programa=a;
    }
     public void cambiarSituacionAcademia(String a){
        situacion_academica=a;
    }
    public int devolverNoBoleta(){
        return no_boleta;
    }
    public String devolverPrograma(){
        return programa;
    }
     public String devolverSituacionAcademia(){
        return situacion_academica;
    }

    @Override
    public String toString() {
        return super.toString()+
                "no_boleta=" + no_boleta + 
                ", programa=" + programa +
                ", situacion_academica=" + 
                situacion_academica;
    }
     
     public static void main(String args[]){
         Persona p[] = new Persona[10];
         
         Docente d1 = new Docente("Julieta Lopez","LORJ900912MZS",123);
         Docente d2 = new Docente("Pedro Ramos","RAMP781212HSP",234);
         Alumno a1 = new Alumno("Jaime Lara","LAVJ990620HZS",1234567);
         Docente d3 = new Docente("Julieta Lopez","LORJ900912MZS",123);
         Docente d4 = new Docente("Pedro Ramos","RAMP781212HSP",234);
         Alumno a2 = new Alumno("Jaime Lara","LAVJ990620HZS",1234567);
         Docente d5 = new Docente("Julieta Lopez","LORJ900912MZS",123);
         Docente d6 = new Docente("Pedro Ramos","RAMP781212HSP",234);
         Alumno a3 = new Alumno("Jaime Lara","LAVJ990620HZS",1234567);
         Alumno a4 = new Alumno("Jaime Lara","LAVJ990620HZS",1234567);
         p[0]=d1;
         p[1]=a1;
         p[2]=d2;
         p[3]=d3;
         p[4]=d4;
         p[5]=a2;
         p[6]=d5;
         p[7]=d6;
         p[8]=a3;
         p[9]=a4;
         
         Persona per1 = p[9];
         Alumno al1 = (Alumno) p[9];
         for( Persona per:p){
            if( per instanceof Docente){
                        System.out.println(per.toString());
             }
         }
     }
}
