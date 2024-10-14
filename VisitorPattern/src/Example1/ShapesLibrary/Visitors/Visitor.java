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
public interface Visitor {

    public void processShape(Circle circle);

    public void processShape(Rectangle rectangle);

    public void processShape(Square square);
}
