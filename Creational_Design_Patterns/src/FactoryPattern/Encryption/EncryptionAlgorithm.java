/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern.Encryption;

/**
 *
 * @author A_Murad
 */
public interface EncryptionAlgorithm {

    //Dont focus on how are these functions works or what are these attributes. Focus on the concept of Factory Pattern.
    public String encryptText(String text);

    public String decryptText(String text);
}
