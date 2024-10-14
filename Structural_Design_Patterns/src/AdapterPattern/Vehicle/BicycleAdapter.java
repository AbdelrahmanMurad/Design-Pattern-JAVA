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
public class BicycleAdapter implements Vehicle {

    Bicycle bike;//Adaptee

    public BicycleAdapter(Bicycle bike) {
        this.bike = bike;
    }

    @Override
    public void accelerate() {
        bike.pendal();
    }

    @Override
    public void pushBreak() {
        bike.stop();
    }

    @Override
    public void soundHorn() {
        bike.ringBell();
    }

}
