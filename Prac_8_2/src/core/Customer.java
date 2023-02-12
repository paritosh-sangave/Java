package core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer 
{
	private String name;
	private String email;
	private String password;
	private double registrationAmount;
	private Date dob;
	public static SimpleDateFormat sdf;
	
	static
	{
		sdf = new SimpleDateFormat("yyyy-mm-dd");
	}
	
	public Customer(String name, String email, String password, double registrationAmount, Date dob) 
	{
//		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
	}
	
	@Override
	public String toString()
	{
		return "Name : "+name+"\nEmail : "+email+"\nPassword : "+password+""
				+ "\nRegistration Amount : "+registrationAmount+"\nDOB : "+sdf.format(dob);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Customer)
		{
			Customer customerObj = (Customer)obj;
			return email.equals(customerObj.email);
		}
		return false;
	}
	
	
}
