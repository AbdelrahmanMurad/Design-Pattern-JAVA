/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern.SocialMediaApp;

/**
 *
 * @author A_Murad
 */
public class UserProfileProxy implements Profile {

    private String userID;
    private UserProfile profileData;

    public UserProfileProxy(String id) {
        userID = id;
    }

    @Override
    public void getProfile() {
        profileData = new UserProfile(userID);
        profileData.getProfile();
    }

}
