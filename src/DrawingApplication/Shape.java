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
public abstract class Shape implements Drawable{
    protected int x;
    protected int y;
    
    @Override
    public void draw(Graphics g)
    {
        System.out.println("This is an abstract class, it cant be drawn");
    };
}
