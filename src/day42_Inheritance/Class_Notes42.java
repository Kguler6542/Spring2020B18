package day42_Inheritance;

public class Class_Notes42 {
    /*
    05/19/2020
Topics:
        Inheritance continue:
            access modifiers: public, protected, default, private,


Access modifers:
     public: accessible at everywhere, visibile to the world
     protected: visible in same package, visible in sub class outisde packagfe
     default: only visible in same package
     private: only visible within the same class

visibility:
     public > protected > default > private

     Inheritance: sub class & super class
        sub class: can inherit visible variables and visible methods from super class
                private: can never be inherited in sub class
                defult: can be inherited as long as sub class is in the same package
                public & protected: can always be inherited to any sub class
                in same package: public, protected, default can be inherited
                different package: public & protected can be inherited

        super cass: cannot inherit anything from sub class
        one class can only extend one class
        one class can be extended by multiple classes
        constructor is not inherited

this: refers to the object instances of the current class
    this(): used for calling the constructors from current clas
    this.: used for calling instance variable and instance methods

    super: refers to the object instance of the super class
    super(): used for calling the constructors from super class
    super.: used for calling the instance variables and isntance methods of super class

constructor calls:
        1. at least one parent class' constructor MUST be called in sub class
        2. if the constructor in parent class is default, it's called automatically in child class
        3.if the parent class' constructor is not default, MUST be called manually in sub class by using super keyword



     */
}
