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
public class B implements Observer {
    //getClass().getName() => This method returns the fully qualified name of the class, including the package name.
    //getClass().getSimpleName() => This method returns the simple name of the class, without the package name.

    @Override
    public void update(String data) {
        System.out.println(getClass().getSimpleName() + " recived data from A: " + data);
    }

}
