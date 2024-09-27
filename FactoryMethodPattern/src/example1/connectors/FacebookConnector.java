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
public class FacebookConnector implements SocialNetworkConnectors {
//steps to post message
    @Override
    public void login(String username, String password) {
        System.out.println("Log in to Facebook");
    }

    @Override
    public void post(String text) {
        System.out.println("Post in Facebook "+text);
    }

    @Override
    public void logout(String text) {
        System.out.println("Logout from Facebook");
    }

}
