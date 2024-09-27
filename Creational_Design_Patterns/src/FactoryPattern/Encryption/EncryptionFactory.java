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
public class EncryptionFactory {
    // public static InterfaceName createdInterfaceName(dataType arg) {}
    // method return the same interface.

    public static EncryptionAlgorithm createEncryptionFactory(int id) {
        if (id == 1) {
            return new PublicKeyEncryption(0.3f, 0.5f);
        } else if (id == 2) {
            return new HashEncryption(5f);
        } else {
            throw new IllegalArgumentException("Invalid Id");
        }
    }
}
