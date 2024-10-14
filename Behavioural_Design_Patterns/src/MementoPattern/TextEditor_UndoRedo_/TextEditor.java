/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoPattern.TextEditor_UndoRedo_;

/**
 *
 * @author A_Murad
 *///Originator: creates & restores Mementos object.
//Manages the text state and can save/restore it using Memento.
public class TextEditor {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void restore(Memento memento) {
        text = memento.getState();
    }
}
