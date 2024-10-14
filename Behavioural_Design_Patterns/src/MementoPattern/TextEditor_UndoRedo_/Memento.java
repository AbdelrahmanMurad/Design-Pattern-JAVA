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
// Here where we save/store the state of TextEditor.
//Stores the state of the text (here, the text content).
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
