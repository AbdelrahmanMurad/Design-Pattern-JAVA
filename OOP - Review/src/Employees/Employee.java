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
public abstract class Employee {
//or abstract public class Employee { (same)
//abstract word becomes before or after the public word.

    private String name;
    private String id;
    private int age;
    private String department;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReport() {
        String report = "Name: " + this.getName() + "\nid: " + this.getId() + "\nage: " + this.getAge() + "\ndepartment: " + this.getDepartment();
        return report;
    }

    public abstract float calcSalary();
//    or abstract public float calcSalary(); (same)
//abstract word becomes before or after the public word.
// when we use abstract in a method, we shoud add it to the class too. => public abstract class Employee {
    // why we use abstract ??
    // 1- when we need it in this situation,
    // 2- to prevent making an object for the class.

}
