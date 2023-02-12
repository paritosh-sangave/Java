package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehicle 
{
	private String chasisNo;// unique ID
	private String model;
	private double price;
	// add manufacture date n make necessary changes
	private Date manufactureDate;
	// add HAS-A(association) relationship btwn Vehicle and its categories
	private Category vehicleCategory;
	// create instance of SINGLE SimpleDateFormat class : for parsing(string--->
	// Date) n for formatting (Date --> string)
	
	private DeliveryAddress address;
	
	public static SimpleDateFormat sdf;//sdf=null
	static 
	{
		//init SDF with pattern
		sdf=new SimpleDateFormat("yyyy-MM-dd");
	}

	public Vehicle(String chasisNo, String model, double price, Date manufactureDate, Category vehicleCategory) 
	{
		super();
		this.chasisNo = chasisNo;
		this.model = model;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.vehicleCategory = vehicleCategory;
	}
	
	public Vehicle(String chasisNo, Date manufactureDate)
	{
		this.chasisNo = chasisNo;
		this.manufactureDate = manufactureDate;
	}
	

	@Override
	public String toString() 
	{
		return "Vehicle [chasisNo=" + chasisNo + ", model=" + model + ", price=" + price + " manufactured on "
				+ sdf.format(manufactureDate)+"Category "+vehicleCategory;
	}

	@Override
	public boolean equals(Object anotherObject) 
	{
		System.out.println("in vehicle's equals");
		if (anotherObject instanceof Vehicle) 
		{
			Vehicle anotherVehicle = (Vehicle) anotherObject;
			return (chasisNo.equals(anotherVehicle.chasisNo) 
					&& manufactureDate.equals(anotherVehicle.manufactureDate));
			// Based upon String's equals (ie. content equality)
			// return chasisNo == (anotherVehicle.chasisNo);
		}
		return false;
	}
	
	
	////////////////////////////////////////////////
	// Nested Class DeliveryAddress
	////////////////////////////////////////////////
	public class DeliveryAddress
	{
		private String adrLine1;
		private String city;
		private String state;
		private String country;
		private String zipCode;
		
		//ctor
		public DeliveryAddress(String adrLine1, String city, String state, String country, String zipCode) 
		{
			super();
			this.adrLine1 = adrLine1;
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}
		
		@Override
		public String toString()
		{
			return "Delivery Address: \nadrLine1 = " + adrLine1 + "\ncity=" + city + "\nstate=" + state + "\ncountry=" + country
					+ "\nzipCode=" + zipCode;
		}
		
		
	}

	// outer class method
	public String linkDeliveryAddress(String adrLine, String city, String state, String country, String zipCode) 
	{
		address=new DeliveryAddress(adrLine,city,state,country,zipCode);
		return "Delivery Address Linked....";
	}

	public DeliveryAddress getAddress() 
	{
		return address;
	}
	
	
}
