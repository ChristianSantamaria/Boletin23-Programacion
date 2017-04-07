/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author csantamariacameselle
 */
public class Ventana {
    
    public void crearVentana1(){
        JFrame marco = new JFrame("Boletin 23 Parte 1");
        
        
        marco.setSize(400,400);
        GridLayout glM = new GridLayout(2,1,0,0);
        marco.setLayout(glM);
        

        JPanel panelArriba = new JPanel();

        JLabel b1 = new JLabel("Nome: ");
        b1.setBounds(4, -5, 2, 2);
        panelArriba.add(b1);
       
        JLabel b2 = new JLabel("Password: ");
        b2.setBounds(4, -7, 2, 2);
        panelArriba.add(b2);
        
        JButton b3 = new JButton("Premer");
        b3.setBounds(5, -8, 2, 2);
        panelArriba.add(b3);
        
        JButton b4 = new JButton("Limpar");
        b4.setBounds(6, -8, 2, 2);
        panelArriba.add(b4);

        marco.add(panelArriba);
        
        
        
        JPanel panelAbajo = new JPanel();
        panelAbajo.add(new JList());
        
        JButton b7 = new JButton("Boton");
        b7.setBounds(5, 5, 2, 1);
        panelAbajo.add(b7);
        
        JTextArea t1 = new JTextArea();
        t1.setBounds(6, 5, 5, 5);
        panelAbajo.add(t1);
        
        marco.add(panelAbajo);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
}
