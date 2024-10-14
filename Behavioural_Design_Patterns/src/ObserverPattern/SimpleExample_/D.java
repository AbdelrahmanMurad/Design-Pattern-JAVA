/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.SimpleExample_;

/**
 *
 * @author A_Murad
 */
public class D implements Observer {

    @Override
    public void update(String data) {
        System.out.println(getClass().getSimpleName() + " recived data from A: " + data);
    }

}
