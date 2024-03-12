package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rhutik");
		al.add("Sagar");
		al.add("Abhi");
		al.add("Amoal");
		
		System.out.println("Original ArrayList :");
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println("\n Reverse ArrayList :");
		System.out.println(al);
	}

}
