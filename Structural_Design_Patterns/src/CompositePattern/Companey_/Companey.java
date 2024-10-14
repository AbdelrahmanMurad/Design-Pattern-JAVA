/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePattern.Companey_;

/**
 *
 * @author A_Murad
 */
public class Companey {

    public static void main(String[] args) {
        DeveloperEmp dev1 = new DeveloperEmp("Ahmad", "1", "other details");
        DeveloperEmp dev2 = new DeveloperEmp("Mohammed", "2", "other details");
        DeveloperEmp dev3 = new DeveloperEmp("Mahmood", "3", "other details");
        DeveloperEmp dev4 = new DeveloperEmp("Abdelrahman", "4", "other details");

        EngineerEmp eng1 = new EngineerEmp("Ahmad", "1", "other details");
        EngineerEmp eng2 = new EngineerEmp("Mohammed", "2", "other details");
        EngineerEmp eng3 = new EngineerEmp("Mahmood", "3", "other details");
        EngineerEmp eng4 = new EngineerEmp("Abdelrahman", "4", "other details");

        ManagerEmp man1 = new ManagerEmp("Ahmad", "1", "other details");
        ManagerEmp man2 = new ManagerEmp("Mohammed", "2", "other details");
        ManagerEmp man3 = new ManagerEmp("Mahmood", "3", "other details");
        ManagerEmp man4 = new ManagerEmp("Abdelrahman", "4", "other details");

        AllEmployees all = new AllEmployees();

        all.addEmployee(dev1);
        all.addEmployee(dev2);
        all.addEmployee(dev3);
        all.addEmployee(dev4);

        all.addEmployee(eng1);
        all.addEmployee(eng2);
        all.addEmployee(eng3);
        all.addEmployee(eng4);

        all.addEmployee(man1);
        all.addEmployee(man2);
        all.addEmployee(man3);
        all.addEmployee(man4);

        all.showDetails();
    }
}
