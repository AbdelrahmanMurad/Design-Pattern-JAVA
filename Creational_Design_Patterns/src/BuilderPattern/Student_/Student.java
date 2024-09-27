/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Student_;

/**
 *
 * @author A_Murad
 */
public class Student {
    //a lot of attributes.

    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String faculty;
    private String department;
    private String address;
    private String phoneNo;
    private float gpa;
    private boolean isGraduate;
    private boolean hasLoad;

    //Alt + Insert => cons + get & set
    private Student(String id, String firstName, String middleName, String lastName, String faculty, String department, String address, String phoneNo) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.faculty = faculty;
        this.department = department;
        this.address = address;
        this.phoneNo = phoneNo;
        this.gpa = gpa;
        this.isGraduate = isGraduate;
        this.hasLoad = hasLoad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public boolean isIsGraduate() {
        return isGraduate;
    }

    public void setIsGraduate(boolean isGraduate) {
        this.isGraduate = isGraduate;
    }

    public boolean isHasLoad() {
        return hasLoad;
    }

    public void setHasLoad(boolean hasLoad) {
        this.hasLoad = hasLoad;
    }

    //Alt + Insert => toString()
    //to print the attributes
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", faculty=" + faculty + ", department=" + department + ", address=" + address + ", phoneNo=" + phoneNo + ", gpa=" + gpa + ", isGraduate=" + isGraduate + ", hasLoad=" + hasLoad + '}';
    }

    //Builder Pattern: Inner Class
    public static class Builder {

        //same attributes
        private String id;
        private String firstName;
        private String middleName;
        private String lastName;
        private String faculty;
        private String department;
        private String address;
        private String phoneNo;
        private float gpa;
        private boolean isGraduate;
        private boolean hasLoad;

        //build method return Outer Class
        //checks before passing the attributes to the outerClass
        public Student build() {
            if (id == null) {
                throw new NullPointerException("You should set the id of the student");//better than returning null
            } else if (firstName == null) {
                throw new NullPointerException("You should set the first name of the student");//better than returning null
            } else if (middleName == null) {
                throw new NullPointerException("You should set the middle name of the student");//better than returning null
            } else if (lastName == null) {
                throw new NullPointerException("You should set the last name of the student");//better than returning null
            } else if (faculty == null) {
                throw new NullPointerException("You should set the faculty of the student");//better than returning null
            } else if (department == null) {
                throw new NullPointerException("You should set the department of the student");//better than returning null
            } else if (address == null) {
                throw new NullPointerException("You should set the address of the student");//better than returning null
            } else if (phoneNo == null) {
                throw new NullPointerException("You should set the phone number of the student");//better than returning null
            } else {
                return new Student(id, firstName, middleName, lastName, faculty, department, address, phoneNo);
            }
        }

        //just setters
        /* 
        - you can use that syntax: setters returning void.
        - but if you want to use the syntax that used in the main class like this:
            builder.setId("122")
                    .setFirstName("Alaa")
                    .setMiddleName("Mohammed")
                    .setLastName("Marzooq")
                    .setAddress("Gaza")
                    .setDepartment("IT")
                    .setFaculty("Software Development")
                    .setPhoneNo("059-123124132");
        - you need to return Builder
        
        
        
           public void setId(String id) {
            this.id = id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public void setGpa(float gpa) {
            this.gpa = gpa;
        }

        public void setIsGraduate(boolean isGraduate) {
            this.isGraduate = isGraduate;
        }

        public void setHasLoad(boolean hasLoad) {
            this.hasLoad = hasLoad;
        }
        
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
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

        public Builder setFaculty(String faculty) {
            this.faculty = faculty;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder setGpa(float gpa) {
            this.gpa = gpa;
            return this;
        }

        public Builder setIsGraduate(boolean isGraduate) {
            this.isGraduate = isGraduate;
            return this;
        }

        public Builder setHasLoad(boolean hasLoad) {
            this.hasLoad = hasLoad;
            return this;
        }

    }
}
