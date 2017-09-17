package inheritance;

public class app{

    public static void main(String[] args){

        // super class
        Bicycle bici = new Bicycle(1, 2, 3);

        System.out.println( bici.getClass().toString() );

        // sub class
        MountainBike mountainBici = new MountainBike(1, 2, 3, 4);

        System.out.println( mountainBici.getClass().toString() );

        if ( mountainBici instanceof Bicycle ){

            System.out.println("yeeeei esta es una sub class");

        }

        if ( bici instanceof MountainBike ){

            System.out.println("???");

        }


    }

}
