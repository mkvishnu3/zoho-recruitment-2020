package com.zoho.firstround;

import java.util.Scanner;

public class PrintWordFromMiddle {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word = sc.nextLine();
		
		if(word != null && word.length()>0)
		{
			printWordFromMid(word);
		}
		else
		{
			System.out.println("Please Provide the string letters as an input");
		}
	}
	
	public static void printWordFromMid(String word)
	{		
		word = word.substring((word.length()/2)) + word.substring(0, (word.length()/2));
		
		for(int i = 0; i<word.length();i++)
		{
			for(int j = 0;j<=i;j++)
			{
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}

}
