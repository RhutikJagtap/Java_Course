//Java Program to iterate ArryList
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(25);
		al.add(30);
		
		System.out.println("Elements in ArrayList : "+al);
	
		System.out.println("Iterate ArrayList using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("\n Iterate ArrayList using for each loop");
		for(Object obj:al)
		{
			System.out.println(obj);
		}

		System.out.println("\n Iterate ArrayList using Iterator");
		Iterator<Integer> itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
