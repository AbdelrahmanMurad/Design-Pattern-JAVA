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
public class DeveloperEmp implements Employee {

    private String name, id, otherDetails;

    public DeveloperEmp(String name, String id, String otherDetails) {
        this.name = name;
        this.id = id;
        this.otherDetails = otherDetails;
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

    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    @Override
    public void showDetails() {
        //operations ...
        System.out.println(getClass().getSimpleName() + ": \n" + name + "\n " + id + "\n " + otherDetails);
    }

}
