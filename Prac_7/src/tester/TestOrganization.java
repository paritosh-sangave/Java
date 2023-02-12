package tester;
import com.app.org.*;
import java.util.*;
import static utils.ValidationRules.*;

public class TestOrganization 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of employees to add:");
		Emp[] employees = new Emp[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		
		while(!exit)
		{
			System.out.println("Options- \n1)Hire Manager \n2)Hire Worker"
					+ "\n3)Display Info of all employees \n4)Update Basic Salary \n5)Exit");
			switch(sc.nextInt())
			{
				case 1:
				if(counter<employees.length)
				{
					System.out.println("Enter Details of Manager:(Name, DeptId, Basic, Performance Bonus)");
					employees[counter] = new Mgr(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
					counter++;
				}
				else
					System.out.println("No Vacancy");
				break;
				
				
				case 2:
				if(counter<employees.length)
				{
					System.out.println("Enter Details of Worker: (Name, DeptId, Basic, Hours worked, Hourly rate)");
					employees[counter] = new Worker(sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
					counter++;
				}
				else
					System.out.println("No Vacancy");
				break;
				
				case 3:
				for(Emp e:employees)
				{
					if(e!=null)
						System.out.println(e);
						if(e instanceof Mgr)
							System.out.println("Performance Bonus : "+((Mgr)e).getPerformanceBonus()+"\n");
						else if(e instanceof Worker)
							System.out.println("Hourly Rate : "+((Worker)e).getHourlyRate()+"\n");
				}
				break;
				
				case 4:
				System.out.println("Enter employee id and increment to be added:");
				try
				{
					int empid = sc.nextInt();
					validateEmpId(empid,counter);
					double incr = sc.nextDouble();
					validateIncrement(incr,employees[empid-1].getBasic());
					System.out.println("Updated Salary is : "+employees[empid-1].setBasic(incr)+"\n");
				}catch(Exception e)
				{
					e.printStackTrace();
					sc.nextLine();
				}
				break;
				
				case 5:
				exit = true;
				break;
				
				default:
					System.out.println("Invalid Entry");
			}
		}
		sc.close();
	}

}
