/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingltonPattern.CountryCodeDictionary_;

/**
 *
 * @author A_Murad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CountryCodeDictionary ccd = CountryCodeDictionary.getInstance();
        CountryCodeDictionary.getInstance(); // wont call
        CountryCodeDictionary.getInstance(); // wont call
        CountryCodeDictionary.getInstance(); // wont call
        CountryCodeDictionary.getInstance(); // wont call
        CountryCodeDictionary.getInstance(); // wont call
        //''Creating the country code dictionary ...'' just one.        

        String code = ccd.getCountryCode("palestine");
        if (code != null) {
            System.out.println("Make the call...");
        }
    }

}
