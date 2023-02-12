package com.app.org;

public class Mgr extends Emp
{
	private double performanceBonus;
	
	public Mgr(String name, String deptId, double basic, double perfBon)
	{
		super(name,deptId,basic);
		performanceBonus = perfBon;
	}
	
	//add method to get Mgr details by overriding toString method
	@Override
	public String toString()
	{
		return super.toString()+"\nNet Salary : "+getSalary();
	}
	
	public double getPerformanceBonus()
	{
		return performanceBonus;
	}
	
	public double getSalary()
	{
		return (getBasic()+performanceBonus);
	}
	
}
