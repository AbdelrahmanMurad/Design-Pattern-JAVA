/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.Vehicle;

/**
 *
 * @author A_Murad
 */
public class NewMain {

    public static void useVehicle(Vehicle car) {
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Car();
        useVehicle(car);
        System.out.println("--");
        Vehicle bike = new BicycleAdapter(new Bicycle());
        useVehicle(bike);
    }

}
