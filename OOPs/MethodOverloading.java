//In method overloading we have to declare more than one method with the same name and with the different parameter list.
class Math {
    void add(int i, int j) {
        System.out.println("ADD :" + (i + j));
    }

    void add(float f1, float f2) {
        System.out.println("ADD :" + (f1 + f2));
    }

    void add(String str1, String str2) {
        System.out.println("ADD :" + (str1 + str2));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Math m = new Math();
        m.add(10, 20);
        m.add(22.2f, 33.3f);
        m.add("Method", " Overloading");
    }
}
