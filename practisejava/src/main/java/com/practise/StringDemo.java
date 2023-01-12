package com.practise;

import java.util.ArrayList;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {

		String s = "India Is My Country I Love My India";
		String s1[] = s.split(" ");
		String s2[] = new String[2];

		System.out.println(Arrays.toString(s1));

		int count = 0;
		int a = 0;
		int i, j, k = 0;
		for (i = 0; i < s1.length; i++) {
			for (j = i ; j < s1.length; j++) {
				if (s1[i] == s1[j]) {
					s2[k] = s1[i];
					k++;
				}
			}
		}
		System.out.println(s2[k]);
	}

}
