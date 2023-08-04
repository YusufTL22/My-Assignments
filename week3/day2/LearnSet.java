package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> set= new HashSet<String> ();
		int [] number = {1,22,3,54,65,22,43,67,98,1};
		set.add("1");
		set.add("22");
		set.add("3");
		set.add("3");
		set.add("54");
		set.add("65");
		set.add("22");
		set.add("43");
		set.add("67");
		set.add("98");
		set.add("1");
		List <String> list= new ArrayList <String>(set);
		System.out.println(list);
		Collections.sort(list);		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)==list.get(i+1));
			System.out.println(list.get(i));
		}
		

	}

}
