package com.interview;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=100;
		int b=50;
		a=b+a;//150
		b=a-b;//150-50=100
		a=a-b;//150-50=50
		System.out.println("after swap a= " + a  +"  after swap b="+b);

	}

}
