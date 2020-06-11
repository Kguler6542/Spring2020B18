package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
       // System.out.println(obj.defaultaccess);// default: only accessible in the same class
        System.out.println(obj.publicAccess);
        // System.out.println(obj.SSN); private means only acceable with in the same class
    }


}
