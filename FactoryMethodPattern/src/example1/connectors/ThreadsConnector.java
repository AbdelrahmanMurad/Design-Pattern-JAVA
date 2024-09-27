/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1.connectors;

/**
 *
 * @author A_Murad
 */
public class ThreadsConnector implements SocialNetworkConnectors {

    @Override
    public void login(String username, String password) {
        System.out.println("Log in Threads");
    }

    @Override
    public void post(String text) {
        System.out.println("Message is " + text);
    }

    @Override
    public void logout(String text) {
        System.out.println("Log out Threads");
    }

}
