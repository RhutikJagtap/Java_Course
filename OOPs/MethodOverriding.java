//In case Of Method Overriding Method Name is Same ,same number of parameter 
//but in different class that class Should have Parent child Relationship

class A {
    void m1() {
        System.out.println("Old Functinality");
    }
}

class B extends A {
    void m1() {
        System.out.println("New Functionality");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        // A a = new A();
        // a.m1();

        // B b = new B();
        // b.m1();

        A a = new B();
        a.m1();

    }
}
