package com.upskill.assignment_1;

public class Assignment_1_1 {

	public static void main(String[] args) {
		int arm1 = 5;
		int arm2 = 7;
		int arm3 = 9;
		int perimeter = trianglePerimeter(arm1, arm2, arm3);
		System.out.println("The perimeter of triangle is = " + perimeter);
		

	}
	
	public static int trianglePerimeter(int arm1, int arm2, int arm3){
		
		int perimeter = arm1 + arm2 + arm3; // " Formula for "The perimeter of triangle "
		
		return perimeter;
		
	}
	

}
