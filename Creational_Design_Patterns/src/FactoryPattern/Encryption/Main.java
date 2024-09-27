/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.Encryption;

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
        System.out.println("Choose Encryption Method: \n1. Public Key \n2. Hash Function");
        int choice = s.nextInt();
        EncryptionAlgorithm e = EncryptionFactory.createEncryptionFactory(choice);
        System.out.println(e.encryptText("Hello World"));
        System.out.println(e.decryptText("^&ASD"));
    }
}
