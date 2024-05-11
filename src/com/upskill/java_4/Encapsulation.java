package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";           // Write & Read
	private int ssn = 45356783;                // Write only
	private String username = "raselalam";     // Read only
	
	// Setter Method - name                     //set the data, write
	public void setName(String value){
		name = value;
	}

	// Getter Method - name                     //get the data, Read
	public String getName(){
		return name;
		}
	
	// Setter Method - SSN                     //set the data, write
	public void setSSN(int value){
			ssn = value;
		}
	
	// Getter Method - Username                     //get the data, Read
	public String getUsername(){
			return username;
			}
	
	public static void main(String[]agrs){
		
		Encapsulation obj = new Encapsulation();
		obj.setName("Muazzem601"); // we can get and set name as we used setter and getter method 
		
		System.out.println(obj.getName()); //  // we can get and set name
		
		obj.setSSN(9999999); // no way to get SSN as we didn't use getter method, only used set method.
		System.out.println(obj.getUsername()); // no way to set username as we only put getter method and not use setter method.
	}

		
		

}
