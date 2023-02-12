package utils;
import core.Customer;
import custom_exception.CustomerHandlingException;

public class ValidationRules
{
	private static long lowerLim;
	private static long upperLim;
	static
	{
		lowerLim = 100000000000L;
		upperLim = 999999999999L;
	}
	
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
			if(c!=null && c.equals(ctest))
				throw new CustomerHandlingException("Duplicate entry");
		}
		return ctest;
	}
	
	public static Customer findByEmail(String email, Customer[] customers) throws CustomerHandlingException
	{
		Customer ctest = new Customer(email);
		for(Customer c: customers)
			if(c!=null && c.equals(ctest))
				return c;
		
		throw new CustomerHandlingException("Customer not found!!");
	}
	
	public static long validateAadhar(long aadhar) throws CustomerHandlingException
	{
		if(aadhar<lowerLim || aadhar>upperLim)
			throw new CustomerHandlingException("Invalid aadhar no. entered");
		return aadhar;
	}
}