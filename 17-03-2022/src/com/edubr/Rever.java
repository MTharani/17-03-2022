package com.edubr;

import java.util.Scanner;

public class Rever {
	static void Rever()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int d,s=0;
		int c=0;
		while(n!=0)
		{
			d=n%10;
			s=s+d;
			n=n/10;
			c++;
		}
		System.out.println("the sum of number is"+s);
		System.out.println("number of digit:"+c);
		
	}

	public static void main(String[] args)
	{
		Rever.Rever();
		

	}

}
