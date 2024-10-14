/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.NewsAgency;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A_Murad
 */
public class NewsPublisher {
//This is Observable class.

    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    void attach(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        } else {
            System.out.println("Subscriber exist !!");
        }
    }

    void detach(Subscriber subscriber) {
        if (subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
        } else {
            System.out.println("Subscriber is not exist !!");
        }
    }

    void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    //sendData()
    void addNews(String news) {
        this.latestNews = news;
        notifySubscribers();
    }

    String getLatestNew() {
        return latestNews;
    }
}
