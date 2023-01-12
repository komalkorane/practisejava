package com.practise;

import java.util.Arrays;

public class RemoveZero {

	public static void main(String[] args) {

		int a[] = { 10, 0, 20, 50, 0, 40, 60, 0, 30, 0 };
		int b[] = new int[a.length];
		int j = 0;
		int k = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[j] = a[i];
				j++;
			}
		}
		int c[] = new int[j];
		for (int i = 0; i < c.length; i++) {
			c[k] = b[i];
			k++;
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}

}
