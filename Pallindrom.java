package com.java.demo.intro;
import java.util.*;

class PallindromeX
{
	public boolean ChkPallindrom(int iValue)
	{
		int iTemp= iValue;
		int iDigit =0;
		int iRev = 0;
		
		while(iTemp != 0)              // for 121 iDigit=1 iRev= 1  iTemp = 12, for 12  iDigit = 2   iRev = 12  iTemp = 1, for 1 iDigit = 1  iRev =121 iTemp= 0
		{
			iDigit = iTemp % 10;
			iRev = (iRev * 10)+ iDigit;
			iTemp = iTemp / 10;
		}
		
		if(iRev == iValue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
public class Pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sobj = new Scanner(System.in);
      
      System.out.println("Enetr the number");
      int iValue = sobj.nextInt();
      
      boolean bRet = false;
      
      PallindromeX obj = new PallindromeX();
      bRet = obj.ChkPallindrom(iValue);
      
      if(bRet == true)
      {
    	  System.out.println("It is a Pallindrom");
      }
      else
      {
    	  System.out.println("It is not a Pallindrom");
      }
      
	}

}
