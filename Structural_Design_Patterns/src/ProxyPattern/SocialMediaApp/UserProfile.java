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
public class UserProfile implements Profile {

    public UserProfile(String id) {
        loadProfileData(id);
    }

    private void loadProfileData(String id) {
        //Fetching profile data for user.
        System.out.println("loading data");
    }

    @Override
    public void getProfile() {
        System.out.println("profile ...");
    }

}
