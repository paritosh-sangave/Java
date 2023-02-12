package vehicles2;
import static vehicles2.Vehicle.sdf;

import java.text.ParseException;

public class TestVehicles 
{
	public static void main(String[] args) throws ParseException
	// main is not handling this exception, delegated to the caller
	{

		Vehicle v1=new Vehicle(12345, "SUV", 1234567, sdf.parse("2021-4-13"));
		Vehicle v2=new Vehicle(12345, "SUV", 1234567, sdf.parse("2021-4-13"));
		
		System.out.println(v1.equals(v2)); // true

	}
}
