package utils;
import custom_exception.CustomException;

public class ValidationRules 
{
	public static void validateEmpId(int empId, int count) throws CustomException
	{
		if(empId<0 || empId>count)
			throw new CustomException("Invalid Employee Id");
	}
	
	public static void validateIncrement(double incr, double basic) throws CustomException
	{
		if(incr<0.05*basic || incr>0.1*basic)
			throw new CustomException("Increment is not between 5 to 10% of the basic salary");
	}
}
