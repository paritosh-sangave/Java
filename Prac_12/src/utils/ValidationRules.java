package utils;
//import java.util.ArrayList;
import java.util.HashMap;

import core.Customer;
import custom_exception.CustomerHandlingException;

public class ValidationRules
{
//	private static long lowerLim;
//	private static long upperLim;
//	static
//	{
//		lowerLim = 100000000000L;
//		upperLim = 999999999999L;
//	}
	
	
	
	public static String validateEmailAndDuplicity(String mailTest, HashMap<String,Customer> customers) 
			throws CustomerHandlingException
	{
		if(!mailTest.contains("@"))
			throw new CustomerHandlingException("Email id must contain @!!");
		
		else if(customers.containsKey(mailTest))
			throw new CustomerHandlingException("Duplicate entry detected..!!");
		
		return mailTest;
	}
	
	public static Customer validateEmailAndPassword(String email, String passw, HashMap<String,Customer> customers) 
			throws CustomerHandlingException
	{
		Customer cTest = customers.get(email);
		if(cTest!=null && passw.equals(cTest.getPassword()))
		{
			System.out.println("Login Successful!");
			return customers.get(email);
		}
		throw new CustomerHandlingException("Invalid Credentials");
	}
	
//	public static Customer validatePassword(Customer clog, String passw) throws CustomerHandlingException
//	{
//		if(passw.equals(clog.getPassword())) 
//		{
//			System.out.println("Login successful!!");
//			return clog;
//		}	
//		throw new CustomerHandlingException("Incorrect Password");
//	}
	
	
	
//	public static long validateAadhar(long aadhar) throws CustomerHandlingException
//	{
//		if(aadhar<lowerLim || aadhar>upperLim)
//			throw new CustomerHandlingException("Invalid aadhar no. entered");
//		return aadhar;
//	}
}