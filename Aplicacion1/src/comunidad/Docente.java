/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comunidad;

/**
 *
 * @author Sandra
 * Creada el 28/06/2019, 01:18:37 PM
 * Version: 1.0
 * Descripción: 
 * Tema: 
 */
public class Docente extends Persona{
    // ATRIBUTOS
    private int no_empleado;
    private String academia;
    //  CONSTRUCTOR
    public Docente(String nombre, String curp, int ne){
        super(nombre,curp);
        no_empleado=ne;
    }
    public void cambiarNoEmpleado(int n){
        no_empleado=n;
    }
    public void cambiarAcademia(String a){
        academia=a;
    }
    public int devolverNoEmpleado(){
        return no_empleado;
    }
    public String devolverAcademia(){
        return academia;
    }

    @Override
    public String toString() {
        return super.toString()+ "no_empleado=" + no_empleado + ", academia=" + academia;
    }
    
}
