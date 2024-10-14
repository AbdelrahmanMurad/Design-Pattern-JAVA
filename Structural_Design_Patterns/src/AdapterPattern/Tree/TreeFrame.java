/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.Tree;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author A_Murad
 */
public class TreeFrame extends JFrame {

    private JTree tree;

    public TreeFrame() {
        this.setTitle("Adapter");

        Person p1 = new Person();
        p1.setFirstName("Ahmed");
        p1.setLastName("Ali");

        Person p2 = new Person();
        p2.setFirstName("Omar");
        p2.setLastName("Ali");

        /* The Original Way
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Design Patterns");
        DefaultMutableTreeNode creationalPatterns = new DefaultMutableTreeNode("Creational Patterns");
        root.add(creationalPatterns);
        DefaultMutableTreeNode factoryPattern = new DefaultMutableTreeNode("Factory");
        creationalPatterns.add(factoryPattern);
         */
        PersonAdapter root = new PersonAdapter(p1);
        PersonAdapter childNode = new PersonAdapter(p2);
        root.add(childNode);

        tree = new JTree(root);

        tree.addTreeSelectionListener(new TreeSelectionListener() {

            @Override
            public void valueChanged(TreeSelectionEvent evt) {
            }

        });
        JScrollPane scrollPane = new JScrollPane(tree);
        this.getContentPane().add(scrollPane);
        this.setSize(400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TreeFrame();
    }
}
