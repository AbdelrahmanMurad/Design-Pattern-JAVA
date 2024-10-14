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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Subject (A)
        A a = new A();

        // Create Observers (B and C)
        B b = new B();
        C c = new C();

        // Register Observers with the Subject
        a.addObserver(b);  // B implements Observer, so it can be added
        a.addObserver(c);  // C implements Observer, so it can be added

        // Send data from A, which will notify all observers
        a.sendData("Hello Observers!");

        //Test
//        System.out.println("---");
//        a.addObserver(b);
//        a.removeObserver(b);
//        a.sendData("Hello :)");
//        a.removeObserver(b);

        //new 
//        D d = new D();
//        a.addObserver(d);
//        System.out.println("---\nnew");
//        a.sendData("new observer D has been created");
    }
}
