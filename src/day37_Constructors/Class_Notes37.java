package day37_Constructors;

public class Class_Notes37 {

    /*
05/11/2020
Topics: static imports vs regular imports
        instance initializer block
        constructor Intro


    syntax:
        import PackageName.ClassName;  // imports one class from package
        import PackageName.*;  // imports all classes from the package
static imports: we can import static variables or methods

    syntax:
        import static PackageName.className.name;  // only imports one static from the class
        import static PackageName.className.*; // imports all static variables and methods from the class
two initializer blcoks in java:

        static initialzier block: gets executed as soon as class is loaded, only once
                                static {
                                        statemnt;
                                }
                        designed for initializing static variables
        instance initializer block: belongs to the object, execution depends on the object
                                {
                                     statements;
                                }
            designed for initializing instance variables
regular methods:
                                        MUST          MUST
        Access-modifers   specifier   return-type  methodName(Parameter){
                statements;
        }
        Access modifiers: public, protected, default, private
        specifiers: static, abstract, final, synchronized
        return-type: void, any primitve and none primitives
        methodName: any name
        parameter: any datatype
Constructor: very special method

            Every class MUST have, if we don't create one,, compiler will creates the no-arg constructor
            execution always depends on the object

        Access-modifier  MethodName(Parameters){
                statements
        }
        methodName: MUST be same with class name
    class Test{
    }
creating object:
         Test   obj = new  Test();

       className  objectName =  new  ExistingConstructor
canvas -> java- > modules -> day37 -> static & instance short quiz
 due by: 11 : 30 am
 PLEASE USE CHROME OR FIRE FOX BROWSER
 This week: constructor
           Encapsulation
           Access modifiers: public, default, private









     */
}
