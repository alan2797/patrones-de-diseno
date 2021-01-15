/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author Usuario
 */
public class Prototype extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
   /* 
    @Override
    public void paint(Graphics g){
        PrototipoCirculo f = new PrototipoCirculo("nom",100,50,50,Color.BLACK);
        PrototipoCirculo f2 = f.clonar();
        f2.setX(200);
        f2.setColor(Color.BLUE);
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(f.getColor());
        g2d.setStroke(new BasicStroke(5));
        g2d.drawOval(f.getX(), f.getY(), f.getTamaño(), f.getTamaño());
        
        Graphics2D g2d2 = (Graphics2D) g;
        g2d2.setColor(f2.getColor());
        g2d2.setStroke(new BasicStroke(5));
        g2d2.drawOval(f2.getX(), f2.getY(), f2.getTamaño(), f2.getTamaño());
        
    }
    */
    public void dibujarCirculo(Graphics g){
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
    }
    
}
