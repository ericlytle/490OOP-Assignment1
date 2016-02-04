/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawingApplication;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ericl
 */
public class DrawingApplication extends JFrame {
    
    Shape oval1 = new Ellipse(40, 40, 60, 90);
    Shape oval2 = new Ellipse(60, 60, 80, 80);
    Shape Rectangle1 = new Rectangle(100, 100, 60, 60);
    Shape Rectangle2 = new Rectangle(120, 120, 80, 100);
    
    Shape[] myShapes = new Shape[]{oval1, oval2, Rectangle1, Rectangle2};
    
    public DrawingApplication(){
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new DrawingApplication();
    }
    
    @Override
    public void paint(Graphics g){
        for (int i = 0; i < myShapes.length; ++i){
            myShapes[i].draw(g);
        }
    }
}
