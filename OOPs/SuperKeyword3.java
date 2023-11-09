//Program To refer superclass constructors from the subclass:
//If we want to access the superclass constructor by using the “super()” statement then
// the respective super() statement must be provided as the first statement in the subclass constructor, 
class A {
    A() {
        System.out.println("A-Con");
    }

    A(int i) {
        System.out.println("A-int-Param-Con");
    }

}

class B extends A {
    B() {
        super(10); // super() statement must be the first statement in subclass Constructor Only
        System.out.println("B-Con");
    }
}

public class SuperKeyword3 {
    public static void main(String[] args) {
        B b = new B();

    }
}
