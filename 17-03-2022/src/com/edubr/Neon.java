package com.edubr;

import java.util.Scanner;

public class Neon
{
	static void neonNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sq=n*n;  //9*9=81
		int d,s=0;
		while(sq!=0) //81!=
		{
			d=sq%10;
			s=s+d;
			sq=sq/10;
		}
		if(s==n)
		{
			System.out.println("neon number");
		}
		else
		{
			System.out.println("not neno number");
		}
	}

	public static void main(String[] args)
	{

        Neon.neonNumber();
	}

}
