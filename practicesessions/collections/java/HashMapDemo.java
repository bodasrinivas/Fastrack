package com.practicesessions.collections.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		HashMap <String ,Double> Hm = new HashMap <String ,Double>();
		
		Hm.put("Brad", new Double(3452.34));
		Hm.put("Ninja", new Double (6454.56));
		Hm.put("Insta", new Double (6574.33));
		Hm.put("Nathan", new Double (7684.87));
		
		System.out.println("count " + Hm);
		
		//getting a entries set
		Set<Map.Entry<String, Double>> set = Hm.entrySet();
		
		//Diaplay that 
		for(Map.Entry<String, Double> me : set) {
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}
		
		System.out.println();
			
		double balance = Hm.get("Ninja");
		Hm.put("Ninja", balance + 1000);
		System.out.println("Ninja's new balance: " +
		Hm.get("Ninja"));
			
		System.out.println();
		}
		
	}


