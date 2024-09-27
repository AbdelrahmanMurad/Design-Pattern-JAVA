/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1.posters;

import example1.connectors.SocialNetworkConnectors;
import example1.connectors.XConnector;

/**
 *
 * @author A_Murad
 */
public class XPoster extends SocialNetworkPosters {
//This post method will handle the process by calling the steps from the connector website.

    @Override
    public SocialNetworkConnectors createConnector() {
        return new XConnector();
    }

}
