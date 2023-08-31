package com.java.demo.intro;
import java.util.*;

class fib
{
	public void fibCal(int iValue)  //5
	{
		int iNo1=0, iNo2 = 1;                    // iNo1 = 0 ,iNo2 = 1 ,iNo3 =0;
		int iNo3 = 0;
		System.out.print(iNo1+"\t"+iNo2+"\t");
		
		for(int i = 1 ; i <= iValue-2 ; i++)    //for  i =1             for  i =2      for i =3
		{                                       //iNo3 = 0+1=1          1+1=2           2+1 = 3
			iNo3 = iNo1+ iNo2;                  //iNo1 = 1                1              2
			System.out.print(iNo3+"\t");       //iNo2 = 1                 2              3
			iNo1= iNo2;                         
			iNo2 = iNo3;              
		}
	}
}
public class Fibonachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sobj = new Scanner(System.in);
       
       System.out.println("Plese enter the value   :  ");  //5
       int iValue = sobj.nextInt();
       
       fib obj = new fib();
       obj.fibCal(iValue);    //5
	} 

}
