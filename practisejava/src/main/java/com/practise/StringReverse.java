package com.practise;

import java.util.Arrays;

public class StringReverse {
public static void main(String[] args) {

	String s = "Shree";
	
	String s1[]=s.split("");
	String s2[]= new String[s1.length];
	System.out.println(Arrays.toString(s1));
	int j=0;
	for(int i=s1.length-1;i>=0;i--) {
		s2[j]=s1[i];
		j++;
	}System.out.println(Arrays.toString(s2));
}

}
