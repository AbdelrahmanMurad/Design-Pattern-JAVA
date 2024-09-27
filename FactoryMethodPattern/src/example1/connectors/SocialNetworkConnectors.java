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
public interface SocialNetworkConnectors {
//steps to post message

    void login(String username, String password);

    void post(String text);

    void logout(String text);

}
