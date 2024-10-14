package MementoPattern.Example2;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();
        
        Originator originator = new Originator();
        originator.setState("State 1");
        originator.setState("State 2");
        savedStates.add(originator.saveToMemento());
        originator.setState("State 3");
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.saveToMemento());
        originator.setState("State 4");
//        originator.restoreFromMemento(savedStates.get(0));

        for (Originator.Memento savedState : savedStates) {
            originator.restoreFromMemento(savedState);
        }
    }
}
