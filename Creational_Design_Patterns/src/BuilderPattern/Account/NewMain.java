/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Account;

/**
 *
 * @author A_Murad
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//first we will call name and address because we want them in Account Class

//Name Class
        Name.Builder name = new Name.Builder();
        name.setFirstName("abdelrahman")
                .setMiddleName("Nabil")
                .setLastName("Murad");

        Name n = name.build();
        System.out.println(n.toString());

//Address Class
        Address.Builder address = new Address.Builder();
        address.setCity("gaza")
                .setHouseNumber(213312)
                .setPostalCode("1221")
                .setStreet("remal");

        Address add = address.build();
        System.out.println(add.toString());

//Account Class
        Account.Builder account = new Account.Builder();
        account.setEmail("abd@gmail.com")
                .setName(n).setAddress(add);

        Account acc = account.build();
        System.out.println(acc.toString());
    }

}
