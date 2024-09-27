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
public class Name {

    private String firstName;
    private String middleName;
    private String lastName;

    private Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    
    
    
    
    public static class Builder {

        private String firstName;
        private String middleName;
        private String lastName;

        public Name build() {
            if (firstName == null) {
                return null;
            }
            if (middleName == null) {
                return null;
            }
            if (lastName == null) {
                return null;
            } else {
                return new Name(firstName, middleName, lastName);
            }
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;

        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

    }

}
