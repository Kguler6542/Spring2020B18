package day49_Polymorphisim;

public class PhoneObjects {
    public static void main(String[] args) {
        iPhone phone1=new iPhone("iPhone X Pro", 1000,"10 inches");
        System.out.println(phone1);
        phone1.calling(11111);
        phone1.texting(0000000);
    }
}
