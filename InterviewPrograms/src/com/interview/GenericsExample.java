package com.interview;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		/* collections will accept any type of data 
		 * like string,number so if we want to accept the only particular data type then we can use
		 * Generics
		 */
		List values=new ArrayList<>();
		values.add(10);
		values.add("dhruva");
		System.out.println(values);
		
		List<Integer> genNum=new ArrayList<>();
		genNum.add(7);
		genNum.add(20);
		genNum.add(45);
		genNum.add(2, 30);
		System.out.println(genNum);
		
		
	}

}
