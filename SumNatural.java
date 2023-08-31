package com.java.demo.intro;

class SumCal
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
public class SumNatural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int iValue = 10;
     
     SumCal obj = new SumCal();
     int iRet = obj.Sum(iValue);
     
     System.out.println("The summation is : "+iRet);
	}

}
