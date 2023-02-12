package utils;
import core.Customer;
import custom_exception.CustomerHandlingException;

public class ValidationRules
{
	public static String validateEmail(String email) throws CustomerHandlingException
	{
		if(!email.contains("@"))
			throw new CustomerHandlingException("Invalid email ID");
		return email;
	}
	
	
	public static Customer validateDuplicity(Customer ctest, Customer[] customers, int count) throws CustomerHandlingException
	{
		for(Customer c: customers)
		{
			if(count==0)
				return ctest;
			else if(c!=null && c.equals(ctest))
				throw new CustomerHandlingException("Duplicate entry");
		}
		return ctest;
		
		//because for each technique gave null pointer exception
		//for(Customer c:customers)
		//	if(c.equals(ctest))
	}
}