package AbstractClass;

/**
 * Created by pruiz on 9/17/17.
 */
public abstract class GraphicObject {
    // declare fields
    int a;
    // declare nonabstract methods
    public void printHi (String name){
        System.out.println( "Hello " + name + "!" );
    }
    
    abstract void draw();

}
