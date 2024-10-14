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
public class PartTimeEmployee extends Employee {

    private int numOfHours;
    private int hourRate;

    public PartTimeEmployee(String name, String id, int numOfHours, int hourRate) {
        super(name, id);
        this.numOfHours = numOfHours;
        this.hourRate = hourRate;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public int getHourRate() {
        return hourRate;
    }

    public void setHourRate(int hourRate) {
        this.hourRate = hourRate;
    }

    @Override
    public String getReport() {
        String basicReport = super.getReport();
        String report = basicReport + "\nnumber of hours: " + this.getNumOfHours() + "\nhour rate: " + this.getHourRate();
        return report;
    }

    public float calcSalary() {
        return numOfHours * hourRate;
    }
}
