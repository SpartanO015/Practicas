/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listeners.metodo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macpro2
 */
public class MiFrame3 extends JFrame {
    
    JButton boton;
    
    MiFrame3(){
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        // Expresiones Lambda
            
        boton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrame3 frame = new MiFrame3();  
        
        frame.setVisible(true);
    }
    
}
