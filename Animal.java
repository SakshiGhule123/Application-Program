package com.java.demo.intro;

class Animal
{
	public void makeSound()
	{
		System.out.println("inside class animal");
	}
}

class cat extends Animal
{
	public void makeSound()
	{
		System.out.println("bark");
	}
	
	
}
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Animal obj = new cat();
     obj.makeSound();
	}

}
