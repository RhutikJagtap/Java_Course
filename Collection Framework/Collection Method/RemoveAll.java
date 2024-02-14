// public boolean removeAll(Collection c):
// It can be used to remove all the elements of the specified Collection from the present Collection object.
//If at least one element is deleted then it will return true value , if no element is deleted then it will return false value.

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RemoveAll {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Rhutik");
        collection.add("Rj");
        collection.add("Amoal");
        collection.add("ABC");
        System.out.println(collection);

        List list = new ArrayList();
        list.add("Rhutik");
        list.add("Rj");
        list.add("Amoal");
        list.add("ABC");
        list.add("XYZ");
        list.add("PQR");

        System.out.println(list);

        System.out.println(list.removeAll(collection));
        System.out.println(list);

        System.out.println(list.removeAll(collection));
        System.out.println(list);
    }
}
