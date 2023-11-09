//Program To refer superclass methods from the subclass

class A {
    void m1() {
        System.out.println("m1-A");

    }

}

class B extends A {
    void m1() {
        System.out.println("m1-B");
    }

    void m2() {
        System.out.println("m2-B");
        this.m1();
        super.m1();
    }

}

public class SuperKeyword2 {
    public static void main(String[] args) {
        B b = new B();
        b.m2();

    }
}
