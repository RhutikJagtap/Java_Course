//Program for Single Inheritance
//Single Inheritance is a relation between classes, it will provide variables and methods from only one superclass to one or more subclasses.
class A {
    int i = 10;

    void m1() {
        System.out.println("m1-A");
    }
}

class B extends A {
    int j = 20;

    void m2() {
        System.out.println("m2-B");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.i);
        a.m1();

        System.out.println();
        B b = new B();
        System.out.println(b.i);
        System.out.println(b.j);
        b.m1();
        b.m2();

    }

}
