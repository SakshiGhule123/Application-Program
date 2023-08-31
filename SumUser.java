package com.java.demo.intro;
import java.util.*;

class SumCalX
{
	public int Sum(int iValue)
	{
		int iSum = 0;
		for(int i = 1 ; i <= iValue ;i++)
		{
			iSum = iSum + i;
		}
		return iSum;
	}
}
public class SumUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the value :");
		int iValue = sobj.nextInt();
		
		SumCalX obj = new SumCalX();
	     int iRet = obj.Sum(iValue);
	     
	     System.out.println("The summation is : "+iRet);
	}

}
