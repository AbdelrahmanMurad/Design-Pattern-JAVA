package DecoratorPattern.Shapes_;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Border implements IShape {

    IShape shape; //for passing it to the constructor
    //additional details
    int borderWidth;
    Color borderColor;

    //constructor will wrap the shape. (Decorator part)
    public Border(IShape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(Graphics g) {
        shape.draw(g);

        //the new operations (drowing border)
        Graphics2D g2d = (Graphics2D) g;
        BasicStroke bs = new BasicStroke(borderWidth);
        g2d.setColor(borderColor);
        g2d.setStroke(bs);

        shape.draw(g2d);
    }

    @Override
    public String describe() {
        return shape.describe() + " with border";
        /*
        shape.describe() contain {
        circle describe
        rectangle describe
        shape describe
        }
         */
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

}
