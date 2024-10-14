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
// Caretaker class that manages Mementos (undo functionality)
//Keeps track of the memento to provide undo functionality.
public class CareTaker {
    
    Memento memento;
    
    public void saveState(TextEditor editor) {
        memento = editor.save();
    }
    
    public void undo(TextEditor editor) {
        editor.restore(memento);
    }
}
