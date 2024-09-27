/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingltonPattern.Logger;

/**
 *
 * @author A_Murad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingletonLogger l = SingletonLogger.getInstance();

        l.getLogger().info("Hello World");
        l.getLogger().severe("Fatal error..");
    }

}
