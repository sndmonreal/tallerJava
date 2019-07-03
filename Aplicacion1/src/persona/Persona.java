/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Sandra Creada el 26/06/2019, 10:47:44 AM Version: 1.0 Descripción:
 * Tema:
 */
public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

    public Persona(String n, int e, char s, float p, float a) {
        nombre = n;
        edad = e;
        sexo = s;
        peso = p;
        altura = a;
    }

    float calcularIMC() {
        return peso / (altura * altura);
    }

    void evaluarIMC() {
        float imc = calcularIMC();
        if (imc <= 18.5) {
            System.out.println("Debajo del peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc > 24.9 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc > 29.9 && imc <= 34.9) {
            System.out.println("Obeso");
        } else if (imc > 34.9) {
            System.out.println("muy obeso");
        } else {
            System.out.println("sin valor");
        }
    }

    float calcularPesoIdeal() {
       float pi = 0;
        if (sexo == 'h') {
            pi = 50 + 0.75f * ((altura*100) - 152.4f);
        } else {
            pi = 45.5f + 0.65f * ((altura*100) - 152.4f);
        }
        return pi;
    }

    float calcularPorcentajeGrasa() {
        float pg = 0;
        if (sexo == 'h') {
            pg = 1.2f * calcularIMC() + 0.23f * (edad) - 10.8f * (1) - 5.4f;
        } else {
            pg = 1.2f * calcularIMC() + 0.23f * (edad) - 10.8f * (0) - 5.4f;
        }
        return pg;
    }

    void evaluarPorcentajeGrasa() {
        float pi = calcularPorcentajeGrasa();
        if (sexo == 'h') {
            if (pi >= 12 && pi <= 20) {
                System.out.println("Normal");
            } else if (pi > 20 && pi <= 25) {
                System.out.println("Limite");
            } else if (pi > 25) {
                System.out.println("obesidad");
            }
        } else {
            if (pi >= 24 && pi <= 30) {
                System.out.println("Normal");
            } else if (pi > 30 && pi <= 33) {
                System.out.println("Limite");
            } else if (pi > 33) {
                System.out.println("obesidad");
            }
        }
    }

    String devolverNombre() {
        return nombre;
    }

    void cambiarNombre(String n) {
        this.nombre = n;
    }

    int devolverEdad() {
        return edad;
    }

    void cambiarEdad(int e) {
        this.edad = e;
    }

    char devolverSexo() {
        return sexo;
    }

    void cambiarSexo(char s) {
        this.sexo = s;
    }

    float devolverPeso() {
        return peso;
    }

    void cambiarPeso(float p) {
        this.peso = p;
    }

    float devolverAltura() {
        return altura;
    }

    void cambiarAltura(float a) {
        this.altura = a;
    }

}
