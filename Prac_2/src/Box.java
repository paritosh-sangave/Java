import java.util.*;
class Box
{
	// tight encapsulation --> private state(private data members)
	// instance variables (non-static) mem allocated on heap upon obj creation 
	private double  width, height, depth;
	
	// add parameterized const. to init state of the box
			
	Box(double w, double h, double depth)
	{
		width = w;
		height = h;
		this.depth = depth; // LHS = instance var, RHS = local var 
	}
	// add a method to return a string form of box dimentions
	String getBoxDim()
	{
		return "Box Dims "+this.width+" * "+this.height+" * "+this.depth;
	}
	//Add a method to return computed volume of box
	double ComputeVolume()
	{
		return width*height*depth;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getDepth()
	{
		return depth;
	}
	
	public boolean isEqual(Box b)
	{
		return (this.width==b.getWidth() && this.height==b.getHeight() && this.depth==b.getDepth());
			
	}
}