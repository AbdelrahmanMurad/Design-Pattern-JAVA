package FlyweightPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author A_Murad
 */
public class Main {

    public static void main(String[] args) {
        CircleFactory factory = new CircleFactory();
        CircleFlyweight[] circles = new CircleFlyweight[10000];
        int counter = 0;
        // Create 10,000 circles sharing the same color and radius
        for (int i = 0; i < 10000; i++) {
            CircleFlyweight circle = factory.getCircle("red", 5); // Shared data
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            circle.draw(x, y); // Unique data (position)
            counter++;
        }
        System.out.println(counter);

        // Memory usage is significantly reduced by sharing color and radius.
    }
}
