package com.acts.geometry;

public class Point2D 
{
	private double x,y;
	
	public Point2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String show()
	{
		return "The co-ordinates are ("+x+","+y+")";
	}
	
	public boolean isEqual(Point2D p)
	{
		return (this.x==p.x && this.y==p.y);
	}
	
	public double distance(Point2D p)
	{
		if(this.isEqual(p))
			return 0;
		else
			return Math.sqrt(Math.pow((this.x - p.x), 2)+Math.pow((this.y - p.y), 2));
	}
	
}
