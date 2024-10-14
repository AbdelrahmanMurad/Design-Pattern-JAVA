/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern.Companey_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class AllEmployees implements Employee {

    List<Employee> listOfEmployees = new ArrayList<>();

    @Override
    public void showDetails() {
        for (Employee e : listOfEmployees) {
            e.showDetails();
            System.out.println("---");
        }
    }

    void addEmployee(Employee lisEmployee) {
        listOfEmployees.add(lisEmployee);
    }

    void removeEmployee(Employee lisEmployee) {
        listOfEmployees.remove(lisEmployee);
    }

}
