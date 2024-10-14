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
public class Circle implements Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.processShape(this);
    }

}
