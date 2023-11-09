//Program To refer superclass variables from the subclass

class A {
    int i = 10;
    int j = 20;
}

class B extends A {
    int i = 30;
    int j = 40;

    B(int i, int j) {
        System.out.println(i + "        " + j);
        System.out.println(this.i + "        " + this.j);
        System.out.println(super.i + "        " + super.j);
    }
}

public class SuperKeyword1 {
    public static void main(String[] args) {
        B b = new B(50, 60);
    }

}
