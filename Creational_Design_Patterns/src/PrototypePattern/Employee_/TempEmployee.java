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
public class TempEmployee extends Employee {

    public TempEmployee(String name, int id, Address address) {
        super(name, id, address);
    }

    @Override
    Employee shallowCopy() {
        return new TempEmployee(name, id, address); // Copies reference of Address
    }

    @Override
    Employee deepCopy() {
        return new TempEmployee(name, id, address.copy()); // Creates a new Address object
    }

}
