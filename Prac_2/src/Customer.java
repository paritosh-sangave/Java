class Customer
{
	private String name, email;
	private int age;
	private double creditLimit;
	
	void setName(String name)
	{
		this.name = name;
	}
	
	void setEmail(String email)
	{
		this.email = email;
	}
	
	void setAge(int age)
	{
		this.age = age;
	}
	
	void setCreditLimit(double creditLimit)
	{
		this.creditLimit = creditLimit;
	
	}
	
	void getName()
	{
		System.out.println("Name: "+this.name);
	}
	
	void getEmail()
	{
		System.out.println("Email Id: "+this.email);
	}
	
	void getAge()
	{
		if(this.age<62 && this.age>21)
			System.out.println("Age: "+this.age);
		else
			System.out.println("Age: "+this.age+" Invalid");
	}
	
	void getCreditLimit()
	{
		if(this.creditLimit<50000 && this.creditLimit>5000)
			System.out.println("Credit Limit: "+this.creditLimit);
		else
			System.out.println("Credit Limit: "+this.creditLimit+" Invalid");
	}
	
}