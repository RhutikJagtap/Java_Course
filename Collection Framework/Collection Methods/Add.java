//public boolean add(Object obj)
//It can be used to add the provided element to the Collection object , if the element is added successfully then the add() method will return true value, 
//if the element is not added to the Collection then the add() method will return false value.


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;


class Add{
   public static void main(String[] args) {
       HashSet hashSet = new HashSet();
       System.out.println(hashSet.add("AAA"));
       System.out.println(hashSet.add("AAA"));
   }
}
