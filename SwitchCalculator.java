package com.java.demo.intro;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch = 'A';
       int a = 10;
       int b = 23;
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
       }
	}

}
