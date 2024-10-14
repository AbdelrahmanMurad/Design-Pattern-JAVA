/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern.TextEditor_UndoRedo;

/**
 *
 * @author A_Murad
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Command addText = new Add_DeleteTextCommand(textEditor, "Hello World!");
        EditorInvoker editor = new EditorInvoker();

        editor.setCommand(addText);
        editor.performAction();
        System.out.println("Text after add: " + textEditor.getText());
        editor.undoAction();
        System.out.println("Text after undo: " + textEditor.getText());
    }

}
