package Resources;


/*
    public: accessible at everywhere, visibile to the world
    protected: visible in same package, visible in sub class outisde packagfe
    default: only visible in same package
    private: only visible within the same class
 */


import  day42_Inheritance.Data;
           //   sub                super
public class Inheritance extends  Data {

    public static void main(String[] args) {

        System.out.println(Inheritance.publicData);
        System.out.println(Inheritance.protectedData);
        //System.out.println(Inheritance.defaultData);
        // System.out.println(Inheritance.privateData);


               }



}
