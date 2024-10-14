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
public class Add_DeleteTextCommand implements Command {

    private TextEditor text;
    private String textToAdd;

    public Add_DeleteTextCommand(TextEditor text, String textToAdd) {
        this.text = text;
        this.textToAdd = textToAdd;
    }

    @Override
    public void execute() {
        text.addText(textToAdd);
    }

    @Override
    public void undo() {
        text.deleteText(textToAdd.length());
    }

}
