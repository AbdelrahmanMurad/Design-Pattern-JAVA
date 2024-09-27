

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import example1.connectors.FacebookConnector;
import example1.connectors.ThreadsConnector;
import example1.connectors.XConnector;
import java.util.Scanner;

/**
 *
 * @author A_Murad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose a Social Media Website to post your message: \n1. Facebook \n2. X \n3. Threads");
        int choice = s.nextInt();
        if (choice == 1) {
            FacebookConnector f = new FacebookConnector();
            f.post("Hello World");
        } else if (choice == 2) {
            XConnector x = new XConnector();
            x.post("Hello World");
        } else if (choice == 3) {
            ThreadsConnector th = new ThreadsConnector();
            th.post("Hello World");
        }
    }

}
