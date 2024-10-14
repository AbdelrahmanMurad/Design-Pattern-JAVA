/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1.ShapesLibrary;

import Example1.ShapesLibrary.Visitors.Visitor;
/**
 *
 * @author A_Murad
 */
public class Rectangle implements Shape {
    
    int width, height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.processShape(this);
    }
    
}
