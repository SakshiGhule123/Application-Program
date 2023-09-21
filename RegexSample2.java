package com.java.demo.intro;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexSample2 {

	public static void main(String[] args) {
		
		String content = "This is Padmaja "+"from Training.com";
		
		String pattern = ".*Tra.*";
		
      boolean isMatch  = Pattern.matches(pattern, content);
      
      System.out.println("The text contains 'book'? " + isMatch);
      
      System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
      System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
      System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
      System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
      System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  

      System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
      System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
      System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
      System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
      System.out.println(Pattern.matches("[amn]?", "am"));//false (a or m or n must come one time)  

	}

}
