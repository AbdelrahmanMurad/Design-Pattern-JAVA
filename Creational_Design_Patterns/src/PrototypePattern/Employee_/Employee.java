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
public abstract class Employee {

    String name;
    int id;
    Address address;

    public Employee(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    abstract Employee shallowCopy();

    abstract Employee deepCopy();

    @Override
    public String toString() {
        return "Employee:" + "\nname = " + name + "\nid = " + id + "\naddress = " + address;
    }

}
