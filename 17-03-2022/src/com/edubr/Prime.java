package com.edubr;

import java.util.Scanner;

public class Prime 
{
    static void primeNumber()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number:");
    	int n=sc.nextInt();
    	int c=0;
    	for(int i=1;i<=n;i++)
    	{
    		if(n%i==0) {
 
    			c=c+1;
    		}
    			
    	}
    	if(c==2)
    	{
    		System.out.println("Prime number");
    	}
    	else
    	{
    		System.out.println("not Prime number");
    	}
    	
    	
    }
	public static void main(String[] args) 
	{
		Prime.primeNumber();

	}

}
