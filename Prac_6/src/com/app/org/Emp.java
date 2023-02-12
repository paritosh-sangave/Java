package com.app.org;

public abstract class Emp 
{
	private static int idGenerator = 1;
	private int id;
	private String name;
	private String deptId;
	private double basic;
	
	
	//public class ctor
	public Emp(String name, String deptId, double basic)
	{
		id=idGenerator++;
		this.name = name;
		this.deptId=deptId;
		this.basic=basic;
	}
	
	//add overriding method toString() to get details of emp
	@Override
	public String toString()
	{
		return "Name : "+name+"\nDept ID : "+deptId+"\nEmp ID : "+id;
	}
	
	//method to get basic salary
	public double getBasic()
	{
		return basic;
	}
	
	public abstract double getSalary();
	
	
	public double setBasic(double incr)
	{
		return basic + incr;
	}

}
