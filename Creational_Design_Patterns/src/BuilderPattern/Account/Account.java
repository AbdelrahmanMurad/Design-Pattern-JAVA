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
public class Account {

    private String email;
    private Name name;
    private Address address;

    private Account(String email, Name name, Address addres) {
        this.email = email;
        this.name = name;
        this.address = addres;
    }

    @Override
    public String toString() {
        return "Account{" + "email=" + email + ", name=" + name + ", address=" + address + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddres() {
        return address;
    }

    public void setAddres(Address addres) {
        this.address = addres;
    }

    //inner Class
    public static class Builder {

        private String email;
        private Name name;
        private Address address;

        public Account build() {
            if (email == null) {
                return null;
            }
            if (name == null) {
                return null;
            }
            if (address == null) {
                return null;
            } else {
                return new Account(email, name, address);
            }
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;

        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

    }

}
