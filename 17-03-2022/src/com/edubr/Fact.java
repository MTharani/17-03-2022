package com.edubr;

public class Fact {

	public static void main(String[] args)
	{
	  int f=1;
	  int s=0;
	  for(int i=1;i<=6;i++)
	  {
		  f=1;
		  for(int j=1;j<=i;j++)
		  {
			  f=f*j;
		  }
		  s=s+f;
	  }
	  System.out.println(s);

	}

}
