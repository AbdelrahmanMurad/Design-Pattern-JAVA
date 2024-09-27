/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1.posters;

import example1.connectors.SocialNetworkConnectors;

/**
 *
 * @author A_Murad
 */
public abstract class SocialNetworkPosters {
//This post method will handle the process by calling the steps from the connector website.

    public void post(String text) {
//        FacebookConnector connector = new FacebookConnector(); // cant use it
        SocialNetworkConnectors connector = createConnector();
        connector.login("Ahmad", "****");
        connector.post("My Message is" + text);
        //Imagine there is number of steps like accessing to the databse and otherthings....
        connector.logout("Done");
    }

    public abstract SocialNetworkConnectors createConnector();//Factory Method
}
