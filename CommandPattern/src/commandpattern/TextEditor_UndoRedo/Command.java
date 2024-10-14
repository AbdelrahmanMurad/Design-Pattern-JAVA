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
public interface Command {

    void execute();//adding text

    void undo();//deleting text
}
