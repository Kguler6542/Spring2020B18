package day48_Abstraction;

public class iphone extends Phone {

    static{
        brand= "iphone";
    }

    public iphone(String model, double price, String size) {
        this.model = model;
        this.price = price;
        this.size = size;


    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("iphone 11 call");
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("iphone 11 text");
    }

    public void facetiming(long phoneNumber){ // unigue action for iphone phone
        System.out.println("Hi Honey");
    }
}
