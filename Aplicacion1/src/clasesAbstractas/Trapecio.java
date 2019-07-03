/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasesAbstractas;

/**
 *
 * @author Sandra
 * Creada el 1/07/2019, 10:45:54 AM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Trapecio extends Figura implements Comparable{
    // ATRIBUTOS
    private float base_mayor;
    private float base_menor;
    private float altura;
    
    public Trapecio(float bm, float bmn, float h){
        super(4);
        base_mayor = bm;
        base_menor=bmn;
        altura=h;
    }

    public float getBase_mayor() {
        return base_mayor;
    }

    @Override
    public String toString() {
        return "Trapecio{" + "base_mayor=" + base_mayor + 
                ", base_menor=" + base_menor + ", altura=" + altura + '}';
    }
    
    public void setBase_mayor(float base_mayor) {
        this.base_mayor = base_mayor;
    }

    public float getBase_menor() {
        return base_menor;
    }

    public void setBase_menor(float base_menor) {
        this.base_menor = base_menor;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        return altura*((base_mayor+base_menor)/2);
    }
    public double calcularPerimetro(){
        return base_mayor+base_menor+2*oblicuos();
    }
    public float oblicuos(){
        float c = (base_mayor-base_menor)/2;
        float obl = (float)Math.sqrt((altura*altura)+(c*c));
        return obl;
    }
    
    public boolean igual(Figura f){
        boolean b=false;
        // validar que el objeto no sea null
        if ( f != null){
            if( f instanceof Trapecio){
                b = calcularArea() == f.calcularArea();
            }
        }
        return b;
    }
    
    public Figura mayorQue(Figura f){
        boolean b=false;
        Figura fig=null;
        // validar que el objeto no sea null
        if ( f != null){
            if( f instanceof Trapecio){
                if (calcularArea() > f.calcularArea()){
                fig = this;
                }else{
                        fig = f;
                        }
            }
        }
        return fig;
    }
    public boolean menorQue(Figura f){
        boolean b=false;
        // validar que el objeto no sea null
        if ( f != null){
            if( f instanceof Trapecio){
                b = calcularArea() < f.calcularArea();
            }
        }
        return b;
    }
}
