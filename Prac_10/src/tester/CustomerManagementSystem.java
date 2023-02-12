package tester;
import static core.Customer.sdf;
import static utils.ValidationRules.validateDuplicity;
import static utils.ValidationRules.validateEmail;

//import java.text.ParseException;
import java.util.Scanner;

import core.Customer;
import core.PlanType;
import static utils.ValidationRules.*;
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
			System.out.println("1) Register Customer\n2) View all Customers details\n3) Link Aadhar Card\n10) exit");
			try
			{
				switch(sc.nextInt())
				{
					case 1:
					if(counter<(customers.length))
					{
						System.out.println("Enter Customer Details:");
						System.out.println("Name, Email, Password, Registration Amount, DOB, Plan Type");
						Customer ctest = new Customer(sc.next(),validateEmail(sc.next()),
								sc.next(),sc.nextDouble(),sdf.parse(sc.next()), PlanType.valueOf(sc.next().toUpperCase()));
						validateDuplicity(ctest, customers, counter);
						customers[counter++] = ctest;
						System.out.println("Customer Registered\n");
					}
					else
						System.out.println("Registrations full!!");
					break;
						
					case 2:
					if(counter==0)
						System.out.println("No Customers added yet");
					for(Customer c:customers)
						if(c!=null)
							System.out.println(c);
					break;
					
					case 3:
					//Since email is primary key, we would take input as email address to link to aadhar card
					System.out.println("Enter email address to link aadhar card to:");
					Customer c = findByEmail(sc.next(),customers);
					System.out.println("Enter Aadhar card no. to be linked:");
					c.linkAadharCard(validateAadhar(sc.nextLong()));
					break;
						
					case 10:
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
			System.out.println("\n");
		}
		sc.close();
	}
}
