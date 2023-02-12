package tester;
import java.util.Scanner;

import com.acts.geometry.Point2D;

public class TestPoint 
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
		
		System.out.println("\n\n");
		
		//Lab Assignment Day 4
		
		System.out.println("How many points to plot?");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		for(int i=0; i<points.length; i++)
		{
			System.out.println("Enter coordinates:");
			points[i] = new Point2D(sc.nextDouble(),sc.nextDouble());
			System.out.println("\n");
		}
		
		for(Point2D p:points)
		{
			System.out.println(p.show());
		}
		
		System.out.println("\n");
		System.out.println("Enter two indices i and j:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.printf("Are points at indices %d & %d same? : "+points[i].isEqual(points[j]),i,j);
		
		System.out.println("\n");
		
		System.out.println("Again enter two indices i and j: ");
		i = sc.nextInt();
		j = sc.nextInt();
		
		System.out.printf("Distance between points[%d] and points[%d] = "+points[i].distance(points[j]),i,j);
		
		
		sc.close();
	}
}
