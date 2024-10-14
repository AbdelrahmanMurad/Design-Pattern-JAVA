/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.SimpleExample_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class A {

    private List<Observer> observers = new ArrayList<>();
    private String data;

    // Add an observer to the list
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        } else {
            System.out.println("Observer exist !!");
        }
    }

    // Remove an observer to the list
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        } else {
            System.out.println("Observer is not exist !!");
        }
    }

    // Notify all observers when data changes
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);  // Call the update() method on each observer
        }
    }

    // Method to change the data and notify observers
    public void sendData(String data) {
        //this is how passing data works (between parameters)
        this.data = data;
        notifyObservers();
    }

}

// you can make this, but separating  is better.
/*
public interface Observer {

    void update(String data);  // Define the update method
}
 */
