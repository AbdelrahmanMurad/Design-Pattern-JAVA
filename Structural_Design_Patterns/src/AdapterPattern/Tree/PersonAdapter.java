/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.Tree;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author A_Murad
 */
public class PersonAdapter extends DefaultMutableTreeNode {

    Person person;//Adaptee

    public PersonAdapter(Person p) {
        this.person = p;
    }

    @Override
    public String toString() {
        return person.getFirstName() + " " + person.getLastName();
    }

}
