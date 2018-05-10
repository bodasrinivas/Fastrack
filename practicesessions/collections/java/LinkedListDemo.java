package com.practicesessions.collections.java;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> LL = new LinkedList<String>();
		
		System.out.println("size  of LL "  + LL.size());

		LL.add("bruno");
		LL.add("Holly");
		LL.add("Nish");
		LL.add("arniban");
		LL.add("Micheal");
	
		System.out.println("size  of LL "  + LL.size());
		System.out.println("count of LL "  + LL);
		
		LL.remove("bruno");
		LL.remove("Holly");
		
		System.out.println("size  of LL "  + LL.size());
		System.out.println("count of LL "  + LL);
		
		LL.addFirst("orlando");
		LL.addLast("Greg");
		//LL.removeLast()
		
		System.out.println("size  of LL "  + LL.size());
		System.out.println("count of LL "  + LL);
		
	
		LL.removeFirst();
		LL.removeLast();
		
		System.out.println("size  of LL "  + LL.size());
		System.out.println("count of LL "  + LL);
		
		String val =LL.get(2);
		LL.set(2, val + " , changed the value ???? ");
		System.out.println("count of LL "  + LL);
	}

}
