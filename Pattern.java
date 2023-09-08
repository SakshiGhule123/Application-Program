package com.java.demo.intro;

public class Pattern {

	public static void main(String[] args) 
	{
		
		int n = 4; 
        for (int i = 1; i <= n; i++)
        {
            
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(j);
            }

          
            for (int j = i - 1; j >= 1; j--) 
            {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line

	    }

  }
}
