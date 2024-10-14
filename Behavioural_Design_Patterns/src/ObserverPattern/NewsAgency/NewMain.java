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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewsPublisher news = new NewsPublisher();
        SMSSubscriber sms = new SMSSubscriber();
        EmailSubscriber email = new EmailSubscriber();

        news.attach(sms);
        news.attach(email);
        //test error
        news.attach(sms);
        news.attach(email);

        System.out.println();
        news.addNews("Today is Rainey");
        System.out.println();

        news.detach(sms);
        news.detach(email);
        //test error
        news.detach(sms);
        news.detach(email);

    }

}
