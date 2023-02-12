package com.app.org;

public class Worker extends Emp 
{
	private double hoursWorked;
	private double hourlyRate;
	
	public Worker(String name,  String deptId, double basic, double hoursWorked, double hourlyRate)
	{
		super(name, deptId, basic);
		this.hoursWorked = hoursWorked;
		this.hourlyRate =  hourlyRate;	
	}
	
	
	@Override
	public String toString()
	{
		return super.toString()+"\nNet Salary : "+getSalary();
	}
	
	@Override
	public double getSalary()
	{
		return getBasic()+hoursWorked*hourlyRate;
	}


	public double getHourlyRate() 
	{
		return hourlyRate;
	}	
}
