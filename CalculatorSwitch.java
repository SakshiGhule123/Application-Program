package com.java.demo.intro;
import java.util.*;
class Calculator
{
	public void Calculation(int a,int b,char ch)
	{
		int iAns = 0;
		
		 switch(ch)
		 {
	       case 'A' :
	    	   
	    	   iAns = a + b;
	    	   System.out.println("Addition is : "+iAns);
	    	   break;
	       case 'B' :
	    	   
	    	   iAns = a - b;
	    	   System.out.println("Substraction is : "+iAns);  
	    	   break;
	       case 'C' :
	    	   
	    	   iAns = a * b;
	    	   System.out.println("Multiplication  is : "+iAns);  
	    	   break;   
	    	   
            case 'D' :
	    	   
	    	   iAns = a / b;
	    	   System.out.println("Division  is : "+iAns);  
	    	   break;      
	       }
	}
}
public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
		   int a = 0;
	       int b = 0;
	     
	       
	       System.out.println("Enter the value of a : ");
	       a = sobj.nextInt();
	       
	       System.out.println("Enter the value of b : ");
	       b = sobj.nextInt();
	       
	       System.out.println( " For Addition enter A \n for Substarction enter B \n for Multiplication enter C \n for Division enter D ");
	       char ch = sobj.next().charAt(0);	
		
		  Calculator obj = new Calculator();
		  obj.Calculation(a, b, ch);
         
      
	}

}
