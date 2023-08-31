package com.java.demo.intro;
import java.util.*;

class FactorialCalculation
{
	
	
	public int fact(int iValue)   // 5
	{
		int iMul = 1;
		for(int i = 1; i <= iValue ;i++)     //for i = 1  iMul = 1 ,for i= 2   iMul = 1*2 =2 ; for i= 3  iMul =2 *3=6 ,for i = 4  iMul = 6*4=24 ,for i = 5 iMul = 24 * 5 = 120
		{
		   iMul = iMul * i;
		}
		return iMul;
	}
	
	
	
	
}
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iRet = 0;
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Plese enter the value  :  ");  //5
      int iValue = sobj.nextInt();
      
      FactorialCalculation obj = new FactorialCalculation();
     iRet = obj.fact(iValue);   // 5
      
     System.out.println("The Factorial is : "+iRet);    //120
	}

}
