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

class C extends A {
    void m3() {
        System.out.println("m3-C");
    }
}

class D extends B {
    void m4() {
        System.out.println("m4-D");
    }
}

class E extends B {
    void m5() {
        System.out.println("m5-E");
    }
}

class F extends C {
    void m6() {
        System.out.println("m6-F");
    }
}

class G extends C {
    void m7() {
        System.out.println("m7-G");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        B b = new B();
        b.m1();
        b.m2();

        C c = new C();
        c.m1();
        c.m3();

        D d = new D();
        d.m1();
        d.m2();
        d.m4();

        E e = new E();
        e.m1();
        e.m2();
        e.m5();

        F f = new F();
        f.m1();
        f.m3();
        f.m6();

        G g = new G();
        g.m1();
        g.m3();
        g.m7();
    }
}