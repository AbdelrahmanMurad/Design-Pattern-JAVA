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
public class Square implements Shape {

    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Square");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.processShape(this);
    }

}
