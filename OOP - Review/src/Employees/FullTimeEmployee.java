/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees;

/**
 *
 * @author A_Murad
 */
public class FullTimeEmployee extends Employee {

    private boolean married;
    private boolean insurance;
    private float basicSalary;

    public FullTimeEmployee(String name, String id, float basicSalary) {
        super(name, id);
        this.basicSalary = basicSalary;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public String getReport() {
        String basicReport = super.getReport();
        String report = basicReport + "\nIs Married ??" + (this.isMarried() ? " Yes" : " No") + "\nHas Insurance ??" + (this.isInsurance() ? " Yes" : " No") + "\nBasic Salary: " + this.getBasicSalary();
        return report;
//       we dont recommend this way
//        String report = "Name: " + this.getName() + "\nid: " + this.getId() + "\nage: " + this.getAge() + "\ndepartment: " + this.getDepartment(); //complete ...
//        return report;
    }

    public float calcSalary() {
        float total = this.basicSalary;

        if (insurance) {
            total -= 300;
        }

        if (married) {
            total += 500;
        }
        return total;
    }
}
