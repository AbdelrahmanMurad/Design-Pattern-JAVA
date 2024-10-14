/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class Controller implements ActionListener {

    View view;
    Model model;

    public Controller(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        List<Student> students = model.getStudentsByFirstName(view.searchField.getText().trim());
        view.updateSearchList(students);

    }

    public List<Student> getAllStudents() {
        List<Student> students = model.getAllStudents();
        return students;
    }

}
