/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;
import javax.swing.*;
import java.awt.*;

public class CalculadoraGUI extends JFrame{
        // ATRIBUTOS DE LA CLASE
    private JLabel num1, num2;
    private JTextField n1, n2,resultado;
    private JButton btnsuma, btnresta, btnmultip, btndiv, btnporc, btnigual;
    
    public CalculadoraGUI(){
        super("Calculadora");// titulo de la ventana
        // poner tamaño a la ventana
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // CREAR OBJETOS
        num1 = new JLabel("Num 1:");
        num2 = new JLabel("Num 2:");
        n1 = new JTextField();
        n2 = new JTextField();
        resultado = new JTextField("Resultado");
        btnsuma = new JButton("Sumar");
        btnresta = new JButton("Restar");
        btnmultip= new JButton("Multiplicar");
        btndiv = new JButton("Dividir");
        btnporc = new JButton("Porcentaje");
        btnigual = new JButton("Igual");
        num1.setBounds(10,10,50,20);
        n1.setBounds(70, 10, 50,20);
        num2.setBounds(10,40,50,20);
        n2.setBounds(70, 40,50,20);
        btnsuma.setBounds(10, 70,100,20);
        btnresta.setBounds(120,70,100,20);
        btnmultip.setBounds(230, 70, 100,20);
        btndiv.setBounds(10,100,100,20);
        btnporc.setBounds(120,100,100,20);
        btnigual.setBounds(230,100,100,20);
        resultado.setBounds(10,130,300,20);
        Dimension d = new Dimension(50,20);
        n1.setPreferredSize(d);
        n2.setPreferredSize(d);
        setLayout(null);
        /*FlowLayout
        BorderLayout
        GridLayout
         GridBagLayout
         CardLayout
         GroupLayout
        */
//        GridLayout gl = new GridLayout(6,2);
//        setLayout(gl);
        add(num1);
        add(n1);
        add(num2);
        add(n2);
        add(btnsuma);
        add(btnresta);
        add(btnmultip);
        add(btndiv);
        add(btnporc);
        add(btnigual);
        add(resultado);
        setVisible(true);
    }
    public static void main(String argd[]){
        CalculadoraGUI c = new CalculadoraGUI();
    }
}
