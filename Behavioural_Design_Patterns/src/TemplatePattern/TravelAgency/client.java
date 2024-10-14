/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern.TravelAgency;

/**
 *
 * @author A_Murad
 */
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.performTrip();
        System.out.println("");
        b.performTrip();
    }

}
