package com.upskill.assignment_1;

public class assignment_1_2 {

	public static void main(String[] args) {
		
		int perimeter = rectanglePerimeter();
		System.out.println("The perimeter of rectangle is = " + perimeter);
		

	}
	
	public static int rectanglePerimeter(){
		
		int width = 9;
		int length = 13;
		int perimeter = 2 * (width + length); // Formula for "The perimeter of rectangle!"
		return perimeter;
	}

}
