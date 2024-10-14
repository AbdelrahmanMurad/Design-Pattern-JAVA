/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgePattern.Shapes_;

/**
 *
 * @author A_Murad
 */
public class Rectangle extends Shape {

    private float width, height;

    public Rectangle(Renderer renderer,float width,float height) {
        super(renderer);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void draw() {
     renderer.renderRectangle(width, height);
    }

}
