/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Account;

/**
 *
 * @author A_Murad
 */
public class Address {

    private int houseNumber;
    private String street;
    private String postalCode;
    private String city;

    private Address(int houseNumber, String street, String postalCode, String city) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" + "houseNumber=" + houseNumber + ", street=" + street + ", postalCode=" + postalCode + ", city=" + city + '}';
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static class Builder {

        private int houseNumber;
        private String street;
        private String postalCode;
        private String city;

        public Address build() {
            if (houseNumber == 0) {
                return null;
            }
            if (street == null) {
                return null;
            }
            if (postalCode == null) {
                return null;
            }
            if (city == null) {
                return null;
            } else {
                return new Address(houseNumber, street, postalCode, city);
            }
        }

        public Builder setHouseNumber(int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;

        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;

        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

    }

}
