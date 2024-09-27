/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1.posters;

import example1.connectors.SocialNetworkConnectors;
import example1.connectors.ThreadsConnector;

/**
 *
 * @author A_Murad
 */
public class ThreadsPoster extends SocialNetworkPosters {

    @Override
    public SocialNetworkConnectors createConnector() {
        return new ThreadsConnector();
    }

}
