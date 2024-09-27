/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern.Employee_;

/**
 *
 * @author A_Murad
 */
public class Address {

    String building;
    String streetName;
    String city;

    public Address(String building, String streetName, String city) {
        this.building = building;
        this.streetName = streetName;
        this.city = city;
    }

    // Deep copy for Address
    // it’s good practice to implement a copy method in this class for deep copying.
    public Address copy() {
        return new Address(this.building, this.streetName, this.city);
    }

    @Override
    public String toString() {
        return "Address{" + "building = '" + building + '\'' + ", streetName = '" + streetName + '\'' + ", city = '" + city + '\'' + '}';
    }
}
