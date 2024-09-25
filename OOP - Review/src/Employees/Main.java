/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

import java.util.ArrayList;

/**
 *
 * @author A_Murad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Employee emp = new Employee("Ahmad", "123"); // cant instantiated bacause of abstract.
//        emp.setAge(20);
//        emp.setDepartment("IT");

        FullTimeEmployee full = new FullTimeEmployee("Mohammed", "456", 1000);
        full.setAge(30);
        full.setDepartment("Eng");
        full.setMarried(true);
        full.setInsurance(false);

        PartTimeEmployee part = new PartTimeEmployee("Mahmoud", "789", 4, 10);
        part.setAge(19);
        part.setDepartment("Eng");

//        System.out.println(emp.getReport());
//        System.out.println("--------------------");
//        System.out.println(full.getReport());
//        System.out.println("Salary: " + full.calcSalary());
//        System.out.println("--------------------");
//        System.out.println(part.getReport());
//        System.out.println("Salary: " + part.calcSalary());
//
//        System.out.println("********************");
//        System.out.println("********************");
//        System.out.println("********************");
        //Now, we dont need the souts lines above ==> thats was for testing.
        //////////////////////////////////////////////////////////////////////////////////////////////////////////// - Polymorphism
        /* Inefficient way [Too Much Of Coding]
        
        ArrayList<FullTimeEmployee> f1 = new ArrayList<>();
        f1.add(full);
        //loop
        
        ArrayList<PartTimeEmployee> p1 = new ArrayList<>();
        p1.add(part);
        //loop
        
         */
        // Efficient way [Polymorphism]
        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(full);
        a1.add(part);

        //Short Loop
        for (Employee e : a1) {
            System.out.println(e.getReport());
            /* Inefficient way to calcSalary [Too Much Of Coding]
            
              if (e instanceof FullTimeEmployee) {
                FullTimeEmployee fff = (FullTimeEmployee) e;
                System.out.println(fff.calcSalary());
            } else if (e instanceof FullTimeEmployee) {
                PartTimeEmployee ppp = (PartTimeEmployee) e;
                System.out.println(ppp.calcSalary());
            }
             */
            //Efficient way: add calcSalary() in SuperClass and make it return 0;
            System.out.println("Salary: " + e.calcSalary());
            System.out.println("------");
        }

    }

}

/* Thats the shape of the final code: 

       FullTimeEmployee full = new FullTimeEmployee("Mohammed", "456", 1000);
        full.setAge(30);
        full.setDepartment("Eng");
        full.setMarried(true);
        full.setInsurance(false);

        PartTimeEmployee part = new PartTimeEmployee("Mahmoud", "789", 4, 10);
        part.setAge(19);
        part.setDepartment("Eng");

        ArrayList<Employee> a1 = new ArrayList<>();
        a1.add(full);
        a1.add(part);

      for (Employee e : a1) {
            System.out.println(e.getReport());
            System.out.println("Salary: " + e.calcSalary());
            System.out.println("------");
        }

 */
