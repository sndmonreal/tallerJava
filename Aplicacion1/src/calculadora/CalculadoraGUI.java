/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGUI extends JFrame implements ActionListener {
    // ATRIBUTOS DE LA CLASE

    private JLabel num1, num2;
    private JTextField n1, n2, resultado;
    private JButton btnsuma, btnresta, btnmultip, btndiv, btnporc, btnigual;
    private CalculadoraBasica calc;

    public CalculadoraGUI() {
        super("Calculadora");// titulo de la ventana
        calc = new CalculadoraBasica();
        // poner tamaño a la ventana
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // CREAR OBJETOS
        num1 = new JLabel("Num 1:");
        num2 = new JLabel("Num 2:");
        n1 = new JTextField();
        n2 = new JTextField();
        resultado = new JTextField("Resultado");
        btnsuma = new JButton("Sumar");
        btnsuma.addActionListener(this);
        btnresta = new JButton("Restar");
        btnresta.addActionListener(this);
        btnmultip = new JButton("Multiplicar");
        btnmultip.addActionListener(this);
        btndiv = new JButton("Dividir");
        btndiv.addActionListener(this);
        btnporc = new JButton("Porcentaje");
        btnporc.addActionListener(this);
        btnigual = new JButton("Igual");
        btnigual.addActionListener(this);
        num1.setBounds(10, 10, 50, 20);
        n1.setBounds(70, 10, 50, 20);
        num2.setBounds(10, 40, 50, 20);
        n2.setBounds(70, 40, 50, 20);
        btnsuma.setBounds(10, 70, 100, 20);
        btnresta.setBounds(120, 70, 100, 20);
        btnmultip.setBounds(230, 70, 100, 20);
        btndiv.setBounds(10, 100, 100, 20);
        btnporc.setBounds(120, 100, 100, 20);
        btnigual.setBounds(230, 100, 100, 20);
        resultado.setBounds(10, 130, 300, 20);
        Dimension d = new Dimension(50, 20);
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

    // DEFINIR METODO action
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == btnsuma) {
                double suma = calc.sumar(n1.getText(), n2.getText());
                resultado.setText("" + suma);
            } else if (e.getSource() == btnresta) {
                resultado.setText("" + calc.restar(n1.getText(), n2.getText()));
            } else if (e.getSource() == btnmultip) {
                resultado.setText("" + calc.multiplicar(n1.getText(), n2.getText()));
            } else if (e.getSource() == btndiv) {
                resultado.setText("" + calc.dividir(n1.getText(), n2.getText()));
            } else if (e.getSource() == btnporc) {
                resultado.setText("" + calc.porcentaje(n1.getText(), n2.getText()));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debes poner numeros");
        }
    }

    public static void main(String argd[]) {
        CalculadoraGUI c = new CalculadoraGUI();
    }
}
