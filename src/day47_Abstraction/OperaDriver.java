package day47_Abstraction;

public class OperaDriver extends RemoteWebDriver {


    @Override
    public void get(String URL) {
        System.out.println("Open "+URL+" in opera browser ");
    }

    @Override
    public void quit() {
        System.out.println("Close opera browser");

    }
}
