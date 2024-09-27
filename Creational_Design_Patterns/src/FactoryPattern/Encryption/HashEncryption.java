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
public class HashEncryption implements EncryptionAlgorithm {

    //Dont focus on how are these functions works or what are these attributes. Focus on the concept of Factory Pattern.
    //HashEncryption is a type of Encryption Methods.
    float tolerance, hashKey;

    //make an auto constructor: Alt+Ins.
    public HashEncryption(float hashKey) {
        this.tolerance = tolerance;
    }

    @Override
    public String encryptText(String text) {
        return "text encrypted by hash algorithm";
    }

    @Override
    public String decryptText(String text) {
        return "text encrypted by hash algorithm";
    }
}
