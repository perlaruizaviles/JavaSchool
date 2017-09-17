package AbstractClass;

/**
 * Created by pruiz on 9/17/17.
 */
abstract class Bike{
    abstract void run();
}

class Honda4 extends Bike{

    // implementation is mandatory!
    void run(){System.out.println("running safely..");}

    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}
