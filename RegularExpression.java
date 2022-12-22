package com.firstpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher mc=Pattern.compile("ab").matcher("abcd ab ab bcs kabaab");
		boolean b2=mc.find();
		boolean mtc=mc.matches();
		System.out.println(mtc);
		if(b2)
		{
			System.out.println("true...");
		}
		else
		{
			System.out.println("false...");
		}
	}

}
 // matcher and find are totally diferrent concepts 
