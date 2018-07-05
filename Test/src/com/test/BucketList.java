package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BucketList {
	
	public static void main(String arg[])throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String,Integer> itemsMap = new LinkedHashMap<String,Integer>();  //Declared map to store items and price
		Map<String,Integer> quantityMap = new HashMap<String,Integer>();    //Declared map to store items and quantity
		 itemsMap.put("Banana", 10);  
		 itemsMap.put("Apple", 20);  
		 itemsMap.put("Orange", 30);
		 itemsMap.put("Peach", 40);
		 
		 List<String> itemList = new ArrayList<String>(itemsMap.keySet()); // Declared list to display item menu
		 Character choice = 'n';	// Declared loop control variable
		 do {
		 
			 System.out.println("*********Item List**********");
			 for(int i = 0; i < itemList.size(); i++) {
				 System.out.println((i+1) + ". " + itemList.get(i) + "(" + itemsMap.get(itemList.get(i)) + ")");
			 }
			 	
			 System.out.print("Enter item no.: ");
			 Integer i = Integer.valueOf(br.readLine());
			 
			 if(i > itemList.size()) {
				 System.out.println("Please select valid item no.");
			 }
			 else {
				 System.out.print("Enter item quantity: ");
				 Integer j = Integer.valueOf(br.readLine());
				 quantityMap.put(itemList.get(i-1), j);
			 }
			 
			 System.out.print("\nDo you wish to enter more items(Y/N)? ");
			 choice = br.readLine().charAt(0);
		 }while(Character.toLowerCase(choice) == 'y');

		  Integer sum=0;
		  
		  // Calculate grand total
		  for(Map.Entry<String, Integer> m1 : quantityMap.entrySet()){  
			 			  
			 sum = sum + (m1.getValue() * itemsMap.get(m1.getKey()));
		  }  
		  
		  System.out.println("Grand total: "  + sum);
	}
}






