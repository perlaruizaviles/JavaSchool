package interfaces;

/**
 * Created by pruiz on 9/17/17.
 */
interface A {
    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {
    public void c() {
        System.out.println("I am C");
    }
}

class M extends B {
    public void a() {
        System.out.println("I am a");
    }

    public void b() {
        System.out.println("I am b");
    }

    public void d() {
        System.out.println("I am d");
    }
}

class Test {
    public static void main(String args[]) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
