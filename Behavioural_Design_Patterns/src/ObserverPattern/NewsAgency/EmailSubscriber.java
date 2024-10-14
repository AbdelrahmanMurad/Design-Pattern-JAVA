/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.NewsAgency;

/**
 *
 * @author A_Murad
 */
public class EmailSubscriber implements Subscriber {

    @Override
    public void update(NewsPublisher newsPublisher) {
        System.out.println(getClass().getSimpleName() + " recieved data from News Publisher, Which is: " + newsPublisher.getLatestNew());
    }

}
