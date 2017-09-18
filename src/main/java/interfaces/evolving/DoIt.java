package interfaces.evolving;

import jdk.internal.dynalink.linker.LinkerServices;

/**
 * Created by pruiz on 9/17/17.
 */
public interface DoIt {
    void doSomething(int i, double x);
    int doSomethingElse(String s);

    // what if you want to add a method??
    // boolean didItWork(int i, double x, String s);
//
//    // First solution
//    default boolean didItWork(int i, double x, String s) {
//        // Method body
//        return true;
//    }

    // Second solution
    static boolean didItWork(int i, double x, String s) {
        // Method body
        return false;
    }

}

class test{

    public static void main( String[] arguments ){

        DoIt a = new DoIt() {
            @Override
            public void doSomething(int i, double x) {
                System.out.println("do something");
            }

            @Override
            public int doSomethingElse(String s) {
                return 10;
            }
        };

//        First solution
//        System.out.print( a.didItWork( 10, 10.0,"perla") );


//        Second solution
//        System.out.print( DoIt.didItWork( 10, 10.0,"perla") );

    }

}
