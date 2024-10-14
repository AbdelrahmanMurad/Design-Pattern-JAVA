/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyweightPattern;

/**
 *
 * @author A_Murad
 */
public class CircleFlyweight {

    private final String color;
    private final int radius;

    public CircleFlyweight(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle with radius " + radius + " at (" + x + ", " + y + ")");
    }
}
