package com.app.core;

public enum Category 
{
	PETROL, DISEL, HYBRID, CNG, EV;
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
