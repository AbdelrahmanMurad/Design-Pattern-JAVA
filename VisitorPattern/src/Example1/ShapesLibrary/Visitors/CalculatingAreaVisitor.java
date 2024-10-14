/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example1.ShapesLibrary.Visitors;

import Example1.ShapesLibrary.Circle;
import Example1.ShapesLibrary.Square;
import Example1.ShapesLibrary.Rectangle;

/**
 *
 * @author A_Murad
 */
public class CalculatingAreaVisitor implements Visitor {

    @Override
    public void processShape(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Circle, Area = " + (int) area);
    }

    @Override
    public void processShape(Rectangle rectangle) {
        double area = rectangle.getHeight() * rectangle.getWidth();
        System.out.println("Rectangle, Area = " + (int) area);
    }

    @Override
    public void processShape(Square square) {
        double area = square.getSide() * square.getSide();
        System.out.println("Square, Area = " + (int) area);
    }

}
