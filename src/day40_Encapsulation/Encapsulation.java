package day40_Encapsulation;

public class Encapsulation {

    private long SSN;

    // getter: read only , public instance method, returning the private instance variables
    // getter : return type must match with instance variables data, no parameter
       public long getSSN(){ return SSN;}

    // setter : write only, return type is VOID
    // setter: passes a parameter , parameter must match with instance variables dataType
    //
      public void setSSN(long SSN){ this.SSN = SSN; }


}
