package com.edubr;

import java.util.Scanner;

public class Armstrong 
{
   static void number()
   {
	   Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=n;
		int d,r=0;
		while(n!=0)
		{
			d=n%10;
			r=(int) (r+Math.pow(d, 3));
			n=n/10;
			
		}
		if(n1==r)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
   }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         Armstrong.number();
	}

}
