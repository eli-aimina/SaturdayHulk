package com.upskill.java_1;

public class MethodType {
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		
	/* Types of Methods
		 
		1.Void Method
		2.Static Method
		3.Return Type Method
		 
	*/
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		System.out.println("Monthly Income = " + obj.monthlyIncomeReturn());
		System.out.println("State Name is  = " + obj.stateReturn());
		
		weeklyIncomeStatic();
		booleanStatic();
		
		
	}
	
	//void method
	public void annualIncomeVoid(){
		
		int calculateAnnualIncome = hourlyIncome * 2000;
		
		System.out.println("Annual Income = " + calculateAnnualIncome);
		
		
		
	}
	
	
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public String stateReturn(){
		//String state = "New York";
		//return state;
		
		//or just write:
		
		return "New-York";
	}
	
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("Weekly Income = " + calculateWeeklyIncome);
	}
	
	public static boolean booleanStatic(){
		boolean employee = true;
		System.out.println("Is the employee working here? = " + employee);
		return employee;
		
		//OR just write:
		
		//return false;
		
	}

}
