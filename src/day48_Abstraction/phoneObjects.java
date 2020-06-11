package day48_Abstraction;

public class phoneObjects {

    public static void main(String[] args) {

       iphone iph1= new iphone("X", 1500,"10 Inc");
       iphone iph2= new iphone("XS",8500,"8 inch");

        System.out.println(iph1);
        System.out.println(iph2);

        iph1.facetiming(1245897);
        iph1.calling(911);
        iph1.texting(000000000);

        System.out.println("====================================");

        Samsung sms1= new Samsung("ABC", 500, "Small");
        System.out.println(sms1);

        sms1.calling(12345688);
        sms1.texting(000000000);
        sms1.freezing();

    }
}

