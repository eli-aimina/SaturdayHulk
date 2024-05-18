package com.upskill.java_1;

public class Variables {
	
//	Variables in Java
	
 //	Instance OR global variable - Variables declared in Class level, outside method
 //	Local variable - variables declared in methods 
 //	Static variable - variables belong to class and don't required creating object
 //	Method parameter - variables used as method parameter
	
	public String country = "USA"; // Global variable or Class-Level variable or Instance variable
	public static String region = "North America";

	public static void main(String[] args) {
		ny("Brooklyn");
		nj("Essex", 50000);
		ct("Litchfield");
		
		Variables myObj = new Variables (); // Create an object: "Class name objectName = new Class name()";
		System.out.println(myObj.country); // Calling 'country' using the object as we didn't using static before 'country' variable
		
		System.out.println(region); // We declared static-keyword before 'region' variable, so we can print it directly without creating object!
		
	}
	
	public static void ny(String county){
		String city = "Queens"; // Local variable
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
	}
	
	public static void nj(String county, int population ){
		String city = "Bloomfield"; // Local variable
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty + " " +  population);
		
		//System.out.println(population);
		
		
	}

	public static void ct(String county){
		String city = "Hartford";
		System.out.println(city);
		
		String myCounty = county;
		System.out.println(myCounty);
	}
	
	//Git Change
	public void git(){
		System.out.println("Test Git");
		System.out.println("Git branching");
		
		
	}

}
