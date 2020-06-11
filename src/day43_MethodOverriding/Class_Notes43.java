package day43_MethodOverriding;

public class Class_Notes43 {
    /*
to override method:
                     * can be done ONLY in SUB class (==> or it will get compile error)
                     * MUST BE SAME method name, SAME parameter, SAME returnType
                     * CAN NOT have private access modifier ( it will not be inherited)
                     * Access modifier MUST be same or more accessible than the original one
                         default ==> protected ==> public
                     * STATIC can NOT be overridden == only ONE copy for all objects
                     * CONSTRUCTORS can NOT be overridden == it can NOT be inherited
                     * Only INSTANCE methods can be overridden
@Override : identifies if method is overridden or not. Must be applicable.
Only ONE method is created in memory (The one created in Super class).
One method with different functions when we override.

================================================================================
05/21/2020
Topics: Method Overriding
        Overloading vs Overriding
package name: day43_MethodOverriding

access modifier:
        public > protected > default > private
method overloading: same method different parameter
                    return-type can be same or different
                    any method can be overloaded
                    access modifier can be same or different

method overriding: same method name, same parameter, same return-type  (MUST)
                   MUST happen in the sub class
                   access modifer MUST be same or more visible

why we need overriding: to implement different functions to the same method

@Override: identifies if the method is overriden method


     */
}
