package com.java.demo.intro;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class RegexSample1 {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(".s");//. represents single character  
		Matcher m = p.matcher("aas");  
		boolean b = m.matches();  

		boolean b2=Pattern.compile(".s").matcher("as").matches();  
	   
		boolean b3 = Pattern.matches(".s", "as");  
		  
		System.out.println(b+" "+b2+" "+b3);  

	}

}
