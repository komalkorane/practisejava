package com.practise;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int num1=num;
		
		int reverse=0;
		int remainder=0;
		
		while(num!=0) {
			
			remainder=num%10;
			reverse= reverse*10+remainder;
			num=num/10;
		}
		System.out.println(reverse);
		if(num1==reverse)
			System.out.println("This is pallindrom !!");
		else
			System.out.println("Not pallindrom !!");
	}

}
