/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author Sandra
 * Creada el 27/06/2019, 10:13:34 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class CalculadoraBasica {
    // ATRIBUTOS
    private double num1;
    private double num2;
    private int cont1;
    private static int cont2;
    // CONSTRUCTOR POR DEFECTO
    public CalculadoraBasica(){
        cont1++;
        cont2++;
    }
    // METODOS
    public double sumar(){
        return num1+num2;
    }
    public double sumar(String n1,String n2){
        num1= Double.parseDouble(n1);
        num2 = Double.parseDouble(n2);
        
        return num1+num2;
        //return sumar();
    }
    public double restar(){
        return num1-num2;
    }
    public double restar(String n1,String n2){
        num1= Double.parseDouble(n1);
        num2 = Double.parseDouble(n2);
        
        return num1-num2;
    }
    public double multiplicar(){
        return num1*num2;
    }
    public double multiplicar(String n1,String n2){
        num1= Double.parseDouble(n1);
        num2 = Double.parseDouble(n2);
        
        return num1*num2;
    }
    public double dividir(){
        if(num2==0)
            num2=1;
        return num1/num2;
    }
    public double dividir(String n1,String n2){
        num1= Double.parseDouble(n1);
        num2 = Double.parseDouble(n2);
        if(num2==0)
            num2=1;
        return num1/num2;
    }
    public double porcentaje(){
        return (num1*num2)/100;
    }
    public double porcentaje(String n1,String n2){
        num1= Double.parseDouble(n1);
        num2 = Double.parseDouble(n2);
        
        return (num1*num2)/100;
    }// cierra porcentaje
    public void cambiarNum1(double n){
        num1=n;
    }
    public void cambiarNum2(double n){
        num2=n;
    }
    public double devolverNum1(){
        return num1;
    }
    public double devolverNum2(){
        return num2;
    }
    public static double sumar(double n1, double num2){
        return n1+num2;
    }
    public static void main(String args[]){
        sumar(12,34.6);
//        CalculadoraBasica cb= new CalculadoraBasica();
//        System.out.println("Suma: "+cb.sumar());
//        double s = cb.sumar("123","234");
//        System.out.println("Suma: "+s);
//        cb.cambiarNum1(12.5);
//        System.out.println(cb.devolverNum1()+" + " 
//                +cb.devolverNum2()
//                +"="+cb.sumar());
//        //CONTANDO OBJETOS
//        System.out.println(cb.cont1);
//        System.out.println(cb.cont2);
//        CalculadoraBasica c2 = new CalculadoraBasica();
//        System.out.println(cb.cont1);
//         System.out.println(c2.cont1);
//        System.out.println(cb.cont2);
//        System.out.println(c2.cont2);
//       
        
    }
    
}
