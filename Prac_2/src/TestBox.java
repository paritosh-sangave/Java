import java.util.Scanner;
//UI : Accept box dimentions from user n display dims n compute vol
class TestBox
{
	public static void main(String[] args)
	{
		//1. Creat a scanner object to read user i/ps
		Scanner sc = new Scanner(System.in);
		//2. Accept box dimentions from user
		System.out.println("Enter box dimensions: w h d");
		Box b1; //b1 --> class type of ref var, method local var: mem allocated at the stack
		b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		//box type of object is mem allocated in the heap, n its address(ref) is stored in b1
		System.out.println(b1.getBoxDim());
		System.out.println("Volume is: "+b1.ComputeVolume());
		
		Box b2 = new Box(31,72,12);
		System.out.println(b2.getBoxDim());
		//System.out.println("Volume is: "+b2.ComputeVolume());
		
		Box b3 = new Box(31.0, 72.00, 12.000);
		System.out.println(b3.getBoxDim());// 31.0 72.0 12.0
		
		System.out.println("Are box b3 and b2 equal: "+b2.isEqual(b3));
		
		//close scanner
		sc.close();
	}
	
}