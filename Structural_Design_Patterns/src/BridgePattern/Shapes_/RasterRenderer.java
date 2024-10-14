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
public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle with radius " + radius + " in raster graphics.");
        //operations ...
    }

    @Override
    public void renderRectangle(float width, float hight) {
        System.out.println("Drawing a rectangle with width " + width + " and hight " + hight + " in raster graphics.");
        //operations ...
    }

}
