/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listeners.metodo4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macpro2
 */
public class MiFrame4 extends JFrame {
    
    JButton boton;
    
    MiFrame(){
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        // Expresiones Lambda
            
        boton.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //
                        System.out.println("X="+e.getX()+" / Y="+e.getY());
                    }
                }
        );
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrame4 frame = new MiFrame4();  
        
        frame.setVisible(true);
    }
    
}
