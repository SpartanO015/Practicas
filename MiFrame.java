/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listeners.metodo1;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macpro2
 */
public class MiFrame extends JFrame {
    
    JButton boton;
    
    MiFrame(){
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        MiListener listener = new MiListener();
        
        boton.addActionListener(listener);
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrame frame = new MiFrame();  
        
        frame.setVisible(true);
    }
    
}
