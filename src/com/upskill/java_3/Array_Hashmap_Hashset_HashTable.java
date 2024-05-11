package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		// Array store multiple data/values using index
		
		int age = 25;                                        // Variable
		int[] ageHulk = new int []{25, 30, 35, 38, 43, 48}; // Array index [0] [1] [2] [3] [4] [5]
		
		
		
		System.out.println("Age: " +ageHulk[3]);
		System.out.println("Total student : " +ageHulk.length);
		
		
		String nameHulk[]=new String[]{"Eli", "Sana", "Esmrita", "Shajia"};
		System.out.println("Student name: " +nameHulk[0]);
		System.out.println("Total student : " +nameHulk.length);
		
		
		//Multi Dimentional Array
		int [][] ageHulk2D = {{25, 30, 35, 38, 43, 28}, //[0][0] [0][1]  [0][2] [0][3] [0][4] [0][5]
				              {23, 32, 38, 27}};  // [1][0]  [1][1] [1][2] [1][3]
		
		System.out.println("Student age 2D: " +ageHulk2D[1][3]);
		
		
		//Hashmap store multiple data using key-value pair, Impletation of Map interface
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Redwan", 27);
		Student.put("Sana", 31);
		Student.put("Sanam", 38);
		Student.put("Muazzem", 24);
		
		System.out.println("Hashmap Student Age: "  +Student.get("Sana"));
		
        HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("United States", "Washington D.C");
		Capital.put("France", "Paris");
		Capital.put("Japan", "Tokyo");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("UK", "London");
		
		
		System.out.println("Capital Name: "  +Capital.get("Bangladesh"));
		
		//HashTable
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region: "  +Region.get("BD"));
		
		//HashSet store
		
		HashSet<String> car =  new HashSet<String>();
		car.add("Audi");
		car.add("BMW");
		car.add("Tesla");
		car.add("Rage Rover");
		car.add("Rolls-Royece");
		
		System.out.println("Car: "  +car);
		
		}
		
}


