package com.Employee;
import java.util.Random;
public class EmpWageComputation
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation/Problem");
		Random randNum = new Random();
      int empCheck = randNum.nextInt()%2;
		if(empCheck==0) { System.out.println(empCheck+"Absent"); }
		else System.out.println("Present");
	}
}
