package com.interview;


import java.util.*;
public class CollectionsTest {

	public static void main(String[] args) {
	
			List<String> li=new LinkedList<>();
				li.add("madhu");
				li.add("venkat");
				li.add("lalli");
				li.add("madhu");
				li.add("venkat");
				li.add("lalli");
				Collections.sort(li); // used to sort in ascending order
				System.out.println(li);
				
				Collections.sort(li,Collections.reverseOrder());//used to sort descending order
				System.out.println(li);
				
				
				
		Set<String> se=new LinkedHashSet<>();
				se.add("lalli");
				se.add("madhu");
				se.add("dhruva");
				se.add("lalli");
				se.add("madhu");
				se.add("dhruva");
				se.add("mass");
				System.out.println(se);
		List<Integer> in=new ArrayList<>();
		for(int i=0; i<=10;i++) {
			in.add(i);
			in.add(100);
		}
				System.out.println(in);
				Set<Integer> sin=new HashSet<>();
				sin.addAll(in); //remove duplicates from the collection set can't allow duplicates
				System.out.println(sin);
				
				
		
		
		}

}
