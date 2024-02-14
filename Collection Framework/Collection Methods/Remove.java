// public boolean remove(Object obj)
// It can be used to remove the specified element from the Collection.
// If the element is removed then it will return true value,if the element is not removed then it will return false value.

import java.util.ArrayList;
import java.util.Collection;

public class Remove {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Rhutik");
        collection.add("Rj");
        collection.add("Amoal");
        collection.add("ABC");
        System.out.println(collection);

        System.out.println(collection.remove("ABC"));
        System.out.println(collection);

        System.out.println(collection.remove("ABC"));
        System.out.println(collection);
    }
}
