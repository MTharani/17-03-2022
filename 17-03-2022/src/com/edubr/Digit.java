package com.edubr;

public class Digit {

	public static void main(String[] args)
	{
		int n=9876;
		int i=0;
		for(i=0; n!=0;n=n/10)
		{
			i=i+n%10;
		}
         System.out.println(i);
	}

}
