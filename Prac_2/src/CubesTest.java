import java.util.*;
class CubesTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Cubes cu; 
		System.out.println("Enter side of cube: ");
		cu = new Cubes(sc.nextDouble());
		
		System.out.println("Dimentions of cube are "+cu.getCubeDim());
		
		System.out.println("Volume of cube is "+cu.ComputeVolume());
	}
}