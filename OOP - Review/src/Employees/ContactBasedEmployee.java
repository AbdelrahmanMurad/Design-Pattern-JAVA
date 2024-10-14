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
public class ContactBasedEmployee extends Employee {

    private long duration;
//you are extending an abstract class, so you need to extend its methods => calcSalary()

    public ContactBasedEmployee(String name, String id, long duration) {
        super(name, id);
        this.duration = duration;
    }

    @Override
    public float calcSalary() {
        //code
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

}
