package abstractclass;

/**
 * Created by pruiz on 9/17/17.
 */
abstract class Bank{
    abstract int getRateOfInterest();
}
class Bancomer extends Bank{
    int getRateOfInterest(){return 7;}
}
class Banamex extends Bank{
    int getRateOfInterest(){return 8;}
}

class TestBank{
    public static void main(String args[]){
        Bank b;
        b=new Bancomer();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        b=new Banamex();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }
}