class A {
    void m1() {
        System.out.println("m1-A");
    }

}

class B extends A {
    void m2() {
        System.out.println("m2-B");
    }
}

class C extends B {
    void m3() {
        System.out.println("m3-C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        B b = new B();
        b.m1();
        b.m2();

        C c = new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
