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
public class Main {

    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();
        Shape circleV = new Circle(vector, 5);
        Shape circleR = new Circle(raster, 10);
        Shape rectangleV = new Rectangle(vector, 5, 2);
        Shape rectangleR = new Rectangle(raster, 10, 4);
    
        circleV.draw();
        circleR.draw();
        rectangleV.draw();
        rectangleR.draw();
    }

}
