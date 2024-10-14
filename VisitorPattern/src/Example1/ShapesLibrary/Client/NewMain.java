package Example1.ShapesLibrary.Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Example1.ShapesLibrary.Circle;
import Example1.ShapesLibrary.Rectangle;
import Example1.ShapesLibrary.Shape;
import Example1.ShapesLibrary.Square;
import Example1.ShapesLibrary.Visitors.CalculatingAreaVisitor;
import Example1.ShapesLibrary.Visitors.CalculatingPerimeterVisitor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(8, 9);
        Square s1 = new Square(3);
        Square s2 = new Square(5);
        CalculatingAreaVisitor calculatingArea = new CalculatingAreaVisitor(); //visitor 1
        CalculatingPerimeterVisitor calculatingPerimeter = new CalculatingPerimeterVisitor(); //visitor 2

        List<Shape> shapes = new ArrayList<>();
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(s1);
        shapes.add(s2);

        for (Shape sh : shapes) {
            sh.draw();
            sh.accept(calculatingArea);
            sh.accept(calculatingPerimeter);
            System.out.println("================");
        }
    }

}
