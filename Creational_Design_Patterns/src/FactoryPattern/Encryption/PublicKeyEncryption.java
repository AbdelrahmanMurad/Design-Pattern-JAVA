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
public class PublicKeyEncryption implements EncryptionAlgorithm {

    //Dont focus on how are these functions works or what are these attributes. Focus on the concept of Factory Pattern.
    //PublicKeyEncryption is a type of Encryption Methods.
    float encryptFactor, compressionFactor;

    public PublicKeyEncryption(float encryptFactor, float compressionFactor) {
        this.compressionFactor = compressionFactor;
        this.encryptFactor = encryptFactor;
    }

    @Override
    public String encryptText(String text) {
        return "text encrypted by public key algorithm";
    }

    @Override
    public String decryptText(String text) {
        return "text decrypted by public key algorithm";
    }

}
