// public boolean addAll(Collection c):
// It can be used to add all the elements of the specified collection to the present Collection object.
// If at least one element is added then it will return true value,if no element is added then it will return false value.

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class AddAll {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Rhutik");
        collection.add("RJ");
        collection.add("Amoal");
        collection.add("ABC");
        System.out.println(collection);

        HashSet hashSet = new HashSet();
        System.out.println(hashSet.addAll(collection));
        System.out.println(hashSet.addAll(collection));
        System.out.println(hashSet);
    }
}
