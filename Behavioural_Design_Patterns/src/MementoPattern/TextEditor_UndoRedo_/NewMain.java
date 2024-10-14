/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoPattern.TextEditor_UndoRedo_;

/**
 *
 * @author A_Murad
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker ct = new CareTaker();

        // Setting text and saving state
        editor.setText("Hello World!!!");
        ct.saveState(editor);
        System.out.println("Text is: " + editor.getText());

        // Changing text
        editor.setText("Version 2");
        System.out.println("Text is: " + editor.getText());

        // Undo to previous state
        ct.undo(editor);
        System.out.println("After undo: " + editor.getText());
    }

}
