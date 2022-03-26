package com.edubr;

import java.util.Scanner;

public class Pallandrome 
{
	static void PallandromeNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=n;
		int d,r=0;
		while(n!=0)
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
			
		}
		System.out.println("the reversed of number is"+r);
		if(n1==r)
		{
			System.out.println("Pallandrome");
		}
		else
		{
			System.out.println("Not Pallandrome");
		}
		
	}
	public static void main(String[] args) 
	{
		Pallandrome.PallandromeNumber();

	}

}
