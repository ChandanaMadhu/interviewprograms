package com.interview;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:  ");
		String str=sc.nextLine();
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {	
			rev=rev+str.charAt(i);
		}
		System.out.println("entered string is " +str);
		System.out.println("Reversed string is" +rev);

	}

}
