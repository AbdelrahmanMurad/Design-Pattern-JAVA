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
public class EditorInvoker {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    void performAction() {
        command.execute();
    }

    void undoAction() {
        command.undo();
    }
}
