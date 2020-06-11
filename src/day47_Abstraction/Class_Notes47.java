package day47_Abstraction;

public class Class_Notes47 {

    /*
06/04/2020
topics: Abstraction:
            abstract methods
            abstract class
            abstratc class vs non-abstract class
package name: day47_Abstraction

OOP Abstraction:
            Abstract method
            Abstract class
            Interface
abstraction: hiding implementation details

abstract method: a method without the body
                 a method that's meant to be override (cannot private, static, final)

        public abstract void method();
        RemoteWebDriver:
                get(URL);
                quit();
        Chrome extends RemoteWebDriver:
                get(URL): opens the chrome
                quit(): quits the chrome
        FireFox extends RemoteWebDriver:
                get(URL): opens the firefox
                quit(): quits firefox
        Opera extends RemoteWebDriver:
                get(URL): opens the Opera
                quit(): quits Opera
        Cybertek extends RemoteWebDriver:
                get(URL): opens the Cybertek Browser
                quit(): closes the cybertek Browser
THERE ARE ONLY TOW WAYS TO ACHIEVE ABSTRACTION:
                                1. ABSTRACT CLASS
                                2. INTERFACE
Abstract class: meant to be inherited ( cannot be final)
                A class that we cannot create object
                when abstract class extended by regular class:
                            we MUST override ALL the abstract methods of super class
                when abstract class extended by abstract class:
                            no need to override any abstract methods
shortcut to override the abstract methods of super class:
        for Mac:
            1. hold "Option"
            2. Hit Enter
            3. Hit enter two times
        for windows:
            1. hold "Alt"
            2. Hit Enter
            3. Hit enter two times
why wer cannot create objects from abstract class?
        abstract is not concrete, object has to be concrete
abstract class vs non-abstract class:
    non-abstract class:
            can not:
                    abstract methods
            can:
                    constructor, instance method, static method, instance block, static block, instance variable, static variable...
    abstract class:
            can:
                constructor, instance method, static method, instance block, static block, instance variable, static variable... AND ASBTRACT METHOD
            can not:
                    cannot create object
                    cannot be final
Monday: Interface
        Interface vs Abstract class


     */
}
