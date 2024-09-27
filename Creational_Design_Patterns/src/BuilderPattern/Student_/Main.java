/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Student_;

/**
 *
 * @author A_Murad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student.Builder builder = new Student.Builder();
        builder.setId("122")
                .setFirstName("Alaa")
                .setMiddleName("Mohammed")
                .setLastName("Marzooq")
                .setAddress("Gaza")
                .setDepartment("IT")
                .setFaculty("Software Development")
                .setPhoneNo("059-123124132");

        Student b = builder.build();//checking on the attributes then passing it.

        System.out.println(b.toString());
        //try to make an error (commit one of the setters here) then see what does it prints.
    }
}
