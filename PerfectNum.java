package com.java.demo.intro;

import java.util.Scanner;

class PerfectCal
{
	public void Calulation(int iNo)
	{
	   int iSum = 0 ;
	   for(int i=1 ;i < iNo; i++ )
	   {
	       if(iNo % i == 0)
	      {
		      iSum=iSum+i;
	      }
	   }
	   
	   if(iSum == iNo)
	   {
		  System.out.println("The number is Perfect Number");
	   }
	   else
	   {
			  System.out.println("The number is not Perfect Number");
	   }
	}
}
public class PerfectNum {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int iNo=sobj.nextInt();
		
		PerfectCal obj = new PerfectCal();
		obj.Calulation(iNo);
		
   
	}

}
