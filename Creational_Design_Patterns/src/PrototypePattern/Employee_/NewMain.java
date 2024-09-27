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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Address address = new Address("B1", "Feet Streat", "New York");
        Employee regEmp1 = new RegularEmployee("Ahmad", 11, address);
        Employee regEmp2 = regEmp1.shallowCopy();//make a shallow copy
//        Employee regEmp2 = regEmp1.deepCopy();//make a deep copy

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\Before Changing\\\\\\\\\\\\\\\\\\\\\\\\\\ [ city is New York]");
        System.out.println("---------------------regEmp1---------------------");
        System.out.println(regEmp1.toString());
        System.out.println("---------------------regEmp2---------------------");
        System.out.println(regEmp2.toString());

        System.out.println();
        regEmp2.address.city = "Los Angeles";
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\After Changing\\\\\\\\\\\\\\\\\\\\\\\\\\ [ city is Los Angeles]");
        System.out.println("---------------------regEmp1---------------------");
        System.out.println(regEmp1.toString());
        System.out.println("---------------------regEmp2---------------------");
        System.out.println(regEmp2.toString());

        System.out.println("Look at City");
        //try the shalow copy then the deep copy

    }

}
