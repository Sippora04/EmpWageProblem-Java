package com.Employee;
import java.util.Random;
public class EmpWageComputation
{
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int FULL_TIME_HOURS = 8;
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation/Problem");
		Random randNum = new Random();
      int empCheck = randNum.nextInt()%2;
		if(empCheck==0) { System.out.println(empCheck+" : Absent"); }
		else {
				int empPresent=FULL_TIME_HOURS*EMP_RATE_PER_HOUR;
				System.out.println("Present and Salary is"+empPresent);
				}

	}
}
