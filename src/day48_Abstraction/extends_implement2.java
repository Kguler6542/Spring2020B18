package day48_Abstraction;

interface P{
    void M1();
}


interface Q extends P{
    int M2();
}


abstract class R{
    abstract void M3();
}




public class extends_implement2 extends R implements Q,P {


    @Override
    public void M1() {

    }

    @Override
    public int M2() {
        return 0;
    }

    @Override
    void M3() {

    }
}
