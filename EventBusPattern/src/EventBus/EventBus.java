package EventBus;

import Client.StudentMSG;
import java.util.ArrayList;
import java.util.List;

public class EventBus {

    private static EventBus instance = null;

    protected List<Subscriber> subscribers = new ArrayList<>();

    private EventBus() {
    }

    public static synchronized EventBus getInstance() {
        if (instance == null) {
            instance = new EventBus();
        }
        return instance;
    }

    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        } else {
            System.out.println("subscriber is already registered !!");
        }
    }

    public void unSubscribe(Subscriber subscriber) {
        if (subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
        } else {
            System.out.println("subscriber is not found !!");
        }
    }

    public void notifySubscribers(BusMSG msg) {
        for (Subscriber subscriber : subscribers) {
            if (!subscriber.equals(msg.getSender())) {
                subscriber.msgReceived(msg);
            }
        }
    }

    public interface Subscriber {

        public void msgReceived(BusMSG msg);

        public void sendToOthers(StudentMSG msg);

    }

    public static abstract class BusMSG {

        protected Subscriber sender;

        public Subscriber getSender() {
            return sender;
        }

        public void setSender(Subscriber sender) {
            this.sender = sender;
        }

    }
}
/*
Event Bus [
1. interface Subscriber
2. static abstract class BusMSG
3. list of subscribers & subscribe() & unsubscribe() & notifySubscribers()
4. convert the EventBus Class to Singleton Class. (one obj)
]
 */

// if you want any information you can read the code explanation the explanation.txt
