package tester;
import com.acts.geometry.Point2D;
import java.util.*;

class TestPoint 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Point2D p1;
		p1 = new Point2D(3.00,4.00);
		System.out.println(p1.show());
		
		Point2D p2;
		p2 = new Point2D(7.23,-9.62);
		System.out.println(p2.show());
		
		System.out.println("Is p1 equal to p2? : "+p1.isEqual(p2));
		
		System.out.println("Enter coordinates:");
		Point2D p3 = new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p3.show());
		
		System.out.println("Enter coordinates:");
		Point2D p4 = new Point2D(sc.nextDouble(),sc.nextDouble());
		System.out.println(p4.show());
		
		System.out.println("Is p1 equal to p2? : "+p3.isEqual(p4));
		
		sc.close();

	}

}
