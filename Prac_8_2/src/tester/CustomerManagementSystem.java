package tester;
import static core.Customer.sdf;

//import java.text.ParseException;
import java.util.Scanner;
import static utils.ValidationRules.*;

import core.Customer;

public class CustomerManagementSystem 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many customers to register?");
		Customer[] customers = new Customer[sc.nextInt()];
		int counter = 0;
		boolean exit = false;
		
		while(!exit)
		{
			System.out.println("Enter your choice:");
			System.out.println("1) Register Customer\n2) View all Customers details\n3) exit");
			try
			{
				switch(sc.nextInt())
				{
					case 1:
					if(counter>(customers.length-1))
					{
						System.out.println("Enter Customer Details:");
						System.out.println("Name, Email, Password, Registration Amount, DOB");
						Customer ctest = new Customer(sc.next(),validateEmail(sc.next()),
								sc.next(),sc.nextDouble(),sdf.parse(sc.next()));
						validateDuplicity(ctest, customers, counter);
						customers[counter++] = ctest;
						System.out.println("Customer Registered\n");
					}
					else
						System.out.println("Registrations full!!");
					break;
						
					case 2:
					for(Customer c:customers)
						if(c!=null)
							System.out.println(c);
					break;
						
					case 3:
					exit = true;
					break;
						
					default:
					System.out.println("Invalid choice Input..!!");
				}
			}catch(Exception e)
			{
				e.printStackTrace();
				sc.nextLine();
			}
		}
		sc.close();
	}
}
