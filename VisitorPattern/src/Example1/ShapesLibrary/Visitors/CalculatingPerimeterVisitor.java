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
public class CalculatingPerimeterVisitor implements Visitor {

    @Override
    public void processShape(Circle circle) {
        System.out.println("Circle, Perimeter = " + (int) (2 * Math.PI * circle.getRadius()));

    }

    @Override
    public void processShape(Rectangle rectangle) {
        System.out.println("Rectangle, Perimeter = " + (int) (2 * (rectangle.getHeight() + rectangle.getWidth())));
    }

    @Override
    public void processShape(Square square) {
        System.out.println("Square, Perimeter = " + (int) 4 * square.getSide());
    }

}
