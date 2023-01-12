package com.practise;

import java.util.Arrays;

public class Digit_char_seperate {

	public static void main(String[] args) {

		String s = "sdff246h788";
		char c1[] = s.toCharArray();
		int b = 0;
		int j = 0;
		char a[] = new char[6];
		char c[] = new char[5];

		for (int i = 0; i < c1.length; i++) {
			if (Character.isLetter(c1[i])) {
				c[b] = c1[i];
				b++;
			}
			if (Character.isDigit(c1[i])) {
				a[j] = c1[i];
				j++;

			}

		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));

	}

}
