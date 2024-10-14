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

public interface Shape {

    public void draw();

    public void accept(Visitor visitor);
}
