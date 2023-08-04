package week1.day2;

import java.util.Arrays;

public class LearnArrays {
	public static void main(String[] args) {
		String [] names = {"Sarifa", "Kather", "Johara", "Yusuf", "Arif"};
		int length = names.length;
		System.out.println(length);
		for(int i=0; i<length; i++) {
			System.out.println(names [i]);
		}
	System.out.println("-------------");
	Arrays.sort(names);
	for(int i=0; i<length; i++) {
		System.out.println(names [i]);
	}
	}

}
