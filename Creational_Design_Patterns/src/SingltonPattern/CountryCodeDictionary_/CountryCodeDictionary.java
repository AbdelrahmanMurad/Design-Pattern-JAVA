/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingltonPattern.CountryCodeDictionary_;

import java.util.HashMap;

/**
 *
 * @author A_Murad
 */
public class CountryCodeDictionary {

    //Hash Map is a data structure. (like Hash Table in js (objects{Key:Value}))
    private HashMap<String, String> countryCodes;

    private static CountryCodeDictionary instance = null; // or any name
    //same as [ private static CountryCodeDictionary instance; ]

    public static synchronized CountryCodeDictionary getInstance() {
        if (instance == null) {
            instance = new CountryCodeDictionary();
        }
        return instance;
    }

    private CountryCodeDictionary() {
        //if the constructor was public, any other class can call it more than one time. so make it private
        System.out.println("Creating the country code dictionary ...");//to ensure that the cons is called one time.
        countryCodes = new HashMap<String, String>();  // initialization 
        countryCodes.put("palestine", "00954");
        countryCodes.put("usa", "123");
        countryCodes.put("uk", "0598");
        countryCodes.put("uae", "44775");
        countryCodes.put("jordan", "4569");
    }

    public String getCountryCode(String countryName) {
        if (countryCodes.containsKey(countryName)) {
            return countryCodes.get(countryName);
        }
        return null;
    }

}
