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
public class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("start moving");
    }

    @Override
    public void pushBreak() {
        System.out.println("stop moving");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb Beeb ...");
    }

  
}
