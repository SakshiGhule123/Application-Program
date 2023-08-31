package com.java.demo.intro;
import java.util.*;

class EvenCal
{
	public void ChkEven(int iValue)
	{
		for(int i = 1; i <= iValue ;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj = new Scanner(System.in);
	       
	       System.out.println("Plese enter the value   :  ");  
	       int iValue = sobj.nextInt();
	       
	       EvenCal obj = new EvenCal();
	       obj.ChkEven(iValue);
	}

}
