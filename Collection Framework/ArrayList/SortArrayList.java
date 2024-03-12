package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(55);
		al.add(88);
		al.add(99);
		al.add(77);
		al.add(73);
		
		
		//Collections class contain static method sort
		Collections.sort(al);
		
		System.out.println(al);

	}

}
