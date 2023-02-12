package utils;
import com.app.core.*;
import java.text.ParseException;
import java.util.Date;

import custom_exception.ShowroomHandlingException;

import static com.app.core.Vehicle.sdf;

public class ValidationRules 
{
	public static Date startDate;
	public static Date endDate;
	static // cannot add tag 'throws' to static initializer block, hence try catch block for ParseException
	{
		try 
		{
			startDate = sdf.parse("2022-4-1");
			endDate = sdf.parse("2023-3-31");
		}catch(ParseException e)
		{
			System.out.println("Err in static init block "+e);
		}
	}
	//add a static method for parsing n validating date
	public static Date parseAndValidateDate(String date) throws ParseException, ShowroomHandlingException
	{
		//parsing
		Date manuDate = sdf.parse(date);
		// => parsing successful, now proceed to validation
//		Date startDate = sdf.parse("2022-4-1");
//		Date endDate =  sdf.parse("2023-3-31");
		if(manuDate.before(startDate) || manuDate.after(endDate))
			throw new ShowroomHandlingException("Invalid Manufacturing Date");
		return manuDate;
	}
	
	public static Vehicle findByChasisNoAndDate(String chasisNo, String date, Vehicle[] vehicles) 
			throws ParseException, ShowroomHandlingException
	{
		Vehicle v1 = new Vehicle(chasisNo, parseAndValidateDate(date));
		for(Vehicle v: vehicles)
			if(v!=null && v.equals(v1))
				return v;
		
		throw new ShowroomHandlingException("Vehicle not found");
	}
	
	public static void checkIfSold(Vehicle v1) throws ShowroomHandlingException
	{
		if(v1.getAddress()!=null)
			throw new ShowroomHandlingException("Vehicle Sold");
	}
}
