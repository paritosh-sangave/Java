package vehicles2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle 
{
	private int chasisNo;// unique ID
	private String model;
	private double price;
	private Date manufacturingDate;
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
	
	public Vehicle(int chasisNo, String model, double price, Date manufacturingDate) 
	{
		// super();
		
		this.chasisNo = chasisNo;
		this.model = model;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}

	@Override
	public String toString() 
	{
		return "Vehicle [chasisNo=" + chasisNo + ", model=" + model + ", price=" + price + ", "
				+ "DOM="+manufacturingDate+"]";
	}

	@Override
	public boolean equals(Object anotherObject) 
	{
		System.out.println("in vehicle's equals");
		if (anotherObject instanceof Vehicle)
			return (chasisNo == ((Vehicle) anotherObject).chasisNo)
					&&this.manufacturingDate.equals(((Vehicle) anotherObject).manufacturingDate);
		return false;
	}
}
