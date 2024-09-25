package Employees;

/* This Project reviews all the OOP in JAVA:
    - Inheritance
    - superClass
    - subClass
    - variables
    - constrcutor
    - methods
    - instance
    - Polymorphism
    - abstract
    - accept scopes
        - public
        - private: Accessible only within the same class (use getters/setters to access from subclass).
        - protected: Accessible to subclasses and classes within the same package.
    - interface: See the bottom of the page. [you will find it there]
*/  

/* The steps of this project:

SuperClass: Employee
    - name - id - age - department
    - cons(name, id)
    - set & get
    - getReport()

SubClass: FullTimeEmployee
    - isMarried - hasInsurance - basicSalary
    - cons(name, id, basicSalary)
    - set & get
    - getReport() --> override from SuperClass
    - calcSalary()

SubClass: PartTimeEmployee
    - numOfHours - hourRate
    - cons(name, id, numOfHours, hourRate)
    - set & get
    - getReport() --> override from SuperClass
    - calcSalary()

SubClass: ContactBasedEmployee
    - duration
    - cons(name, id, duration)
    - set & get
    - calcSalary

*Subclasses must either call superclass constructors or inherit them.
*Subclasses must implement all abstract methods from their abstract superclass unless they are also abstract.
*/

/*
mainClass
    - instance for Employee (not important)
        - age   
        - department

    - instance for FullTimeEmployee
        - age
        - department
        - married
        - insurance

    - instance for PartTimeEmployee
        - age
        - department

    - getReport for full & part (not important)
    - calcSalary for full & part (not important)

    //////////////////////////////////////////////////////////////////////////////////////////////////////////// - Polymorphism to getReport & calcSlary for each employee

    - If you have 100 FullTimeEmployee & 50 PartTimeEmployee, How would you handle this?
        - Inefficient way [Too Much Of Coding]
            - Make arrayList for FullTimeEmployee
            - Loop to getReport() & calcSalary() for each employee added to the array.

            - Make arrayList for PartTimeEmployee
            - Loop to getReport() & calcSalary() for each employee added to the array.

        - Efficient way [Polymorphism]
            - Make arrayList for FullTimeEmployee & PartTimeEmployee from Employee Type.
            - Loop to getReport() & calcSalary() for each employee added to the array.
            - You will note that you can't use calcSalary() because its not in the superCalss, How to Handle this problem ??
                - Fisrt Solution: using if statement with instanceof & casting for each type. (Imagine you have 5 types or more - too much coding)
                - Second Solution: add calcSalary() in SuperClass and make it return 0;
*/


/* if (e instanceof FullTimeEmployee) {}
Checks if the object e is an instance of the class FullTimeEmployee or its subclasses. 
In this case, the code is checking if the variable e is of type FullTimeEmployee. If true, the body of the if statement will execute.

Why Use It?
Polymorphism: When you have a variable of a superclass (like Employee) but need to perform specific actions for a subclass (like FullTimeEmployee), instanceof helps differentiate between the subclasses at runtime.
Downcasting: After verifying the object type with instanceof, you can safely cast the object to its actual class and use its specific properties and methods.
*/



/* about abstract [you can see another explanation on the Employee Class]

In Java, the `abstract` keyword is used to define methods and classes that are incomplete and meant to be implemented or extended by subclasses. 
An abstract class **cannot be instantiated**, and an abstract method **must** be implemented by any non-abstract subclass. 
Abstract methods provide a blueprint for functionality, ensuring subclasses define specific behavior while allowing for shared code in the abstract class.

Example:
```java
abstract class Employee {
    abstract float calcSalary(); // Must be implemented in subclass
}
```

This promotes code structure and enforces certain methods in subclasses.
*/


/*Interface

In Java, the interface keyword is used to define a contract that a class must follow. 
An interface contains abstract methods (methods without a body) that must be implemented by any class that "implements" the interface. 
Unlike abstract classes, interfaces cannot have instance fields and support multiple inheritance, allowing a class to implement multiple interfaces.

Example:
```java
interface Payable {
    float calcPayment();
}
class Employee implements Payable {
    public float calcPayment() {
        return 5000.0f; // Implementation of the method
    }
}
```

This promotes abstraction and ensures that implementing classes provide the required behaviors.

- so we dont use abstract in interface classes
- An interface in Java is similar to an abstract class that contains only abstract methods (before Java 8).
*/