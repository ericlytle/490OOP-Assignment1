/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawingApplication;
import java.awt.*;
/**
 *
 * @author ericl
 */
public class Rectangle extends Shape{
    private final int height;
    private final int width;
    
    public Rectangle(int x, int y, int height, int width){
        super.x = x;
        super.y = y;
        this.height = height;
        this.width = width;
    }
    
    @Override
    public void draw(Graphics g){
        g.drawRect(super.x, super.y, this.width, this.height);
    }
}
