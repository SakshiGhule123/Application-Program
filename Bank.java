package com.java.demo.intro;
import java.util.*;
class BankAccount
{
	public void Deposit()
	{
		System.out.println("inside BankAccount class Deposit method");
	}
	
	public void withdraw()
	{
		System.out.println("inside BankAccount class withdraw method");
	}
}

class SavingAcccount extends BankAccount
{
	int Amount ;
	
	public SavingAcccount(int a)
	{
		 Amount = a;
	}
	public void withdraw()
	{
		
		if(this.Amount <= 100)
		{
			System.out.println("You Can not Withdraw your amount is very less");
		}
		else
		{
			System.out.println("You can Withdraw ");
		}
	}
}
public class Bank {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);
		
      
       System.out.println("Enter your Saving  balance amount : ");
       int iAmount=sobj.nextInt();
       
		SavingAcccount obj = new  SavingAcccount(iAmount);
		obj.withdraw();
	}

}
