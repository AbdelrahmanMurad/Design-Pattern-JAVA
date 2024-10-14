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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profile p1 = new UserProfileProxy("111");
        Profile p2 = new UserProfileProxy("222");
        Profile p3 = new UserProfileProxy("333");
        p3.getProfile();
        System.out.println("");
        
        Profile u1 = new UserProfile("535");
        Profile u2 = new UserProfile("23424");
        Profile u3 = new UserProfile("2133214");
        u2.getProfile();
    }

}
