package core;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Customer 
{
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	public static SimpleDateFormat sdf;
	private PlanType pt;
//	private AadharCard aadharNo;
	
	static
	{
		sdf = new SimpleDateFormat("yyyy-mm-dd");
	}
	
	public Customer(String name, String email, String password, double registrationAmount, String dob, PlanType pt) 
	{
//		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = LocalDate.parse(dob);
		this.pt = pt;
	}
	
	public Customer(String email)
	{
		this.email = email;
	}
	
	
	
	@Override
	public String toString()
	{
//		String aadharInfo=aadharNo==null?"\nAadhar Not linked":("\n"+aadharNo.toString());
		return "Name : "+name+"\nEmail : "+email+"\nPassword : "+password+""
				+ "\nRegistration Amount : "+registrationAmount+"\nDOB : "+dob+
				"\nPlanType : "+pt+"\n";
//				+aadharInfo+"\n";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Customer)
		{
			Customer customerObj = (Customer)obj;
			return (email.equals(customerObj.email));
		}
		return false;
	}
	
	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
		System.out.println("Password updated");
	}

	public String getEmail() 
	{
		return email;
	}

	/////////////////////////////
	// Nested class AadharCard
	/////////////////////////////
//
//
//
//	public class AadharCard
//	{
//		private long aadharNo;
//
//		public AadharCard(long aadharNo) 
//		{
//			super();
//			this.aadharNo = aadharNo;
//		}
//		
//		@Override
//		public String toString()
//		{
//			return "Aadhar Card No. :"+aadharNo;
//		}
//	}
//	
//	//outer class method
//	public void linkAadharCard(long aadhar)
//	{
//		aadharNo = new AadharCard(aadhar);
//		System.out.println("Aadhar card linked");
//	}
//	
//	public AadharCard getAadharNo()
//	{
//		return aadharNo;
//	}
	
}
