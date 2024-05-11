package com.upskill.assignment_1;

public class Assignment_1_3 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 11;
		
		int Mul = multiplication(a,b);
		int add = addition (a, b, Mul);
		System.out.println("Multiplication of a and b is = " + Mul);
		System.out.println(add);
		
	}
	
	public static int multiplication(int a, int b){
		int Mul = a * b ;
		return Mul;
	}
	
	public static int addition(int a, int b, int Mul){
		int add = a + b + Mul ;
		return add;
		
	}

 
}
