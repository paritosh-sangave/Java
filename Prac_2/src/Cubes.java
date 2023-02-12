
class Cubes
{
	private double side;
	
	Cubes(double side)
	{
		this.side = side;
	}
	
	String getCubeDim()
	{
		return this.side+" * "+this.side+" * "+this.side;
	}
	
	double ComputeVolume()
	{
		return this.side*this.side*this.side;
	}
}