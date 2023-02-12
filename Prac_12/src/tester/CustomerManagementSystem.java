package tester;
//import static utils.ValidationRules.validateAadhar;
import static utils.ValidationRules.validateEmailAndDuplicity;
import static utils.ValidationRules.validateEmailAndPassword;

import java.util.Arrays;
import java.util.HashMap;
//import java.util.Iterator;
//import java.text.ParseException;
import java.util.Scanner;

import core.Customer;
import core.PlanType;

public class CustomerManagementSystem 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		HashMap<String,Customer> customers = new HashMap<>(50,0.76F); // init capacity 50, load factor 0.76F
		boolean exit = false;
		
		while(!exit)
		{
			System.out.println("Enter your choice:");
			System.out.println("1) Register Customer\n2) View all Customers details\n3) Customer login "
					+ "\n4) Change Password \n5) Unsubscribe Customer \n10) exit");
			try
			{
				switch(sc.nextInt())
				{
					//Register Details of customer
					case 1:
						System.out.println("Enter desired Email ID:");
						String mailTest = validateEmailAndDuplicity(sc.next(),customers);
						System.out.println("Email address is valid and available!!");
						System.out.println("Enter Customer details");
						System.out.println("Name, Password, Registration Amt., DOB, Plan type");
						System.out.println("Valid Plan Types : "+Arrays.toString(PlanType.values()));
						Customer ctest = new Customer(sc.next(),mailTest,sc.next(),sc.nextDouble(),sc.next(),
								PlanType.valueOf(sc.next().toUpperCase()));
						customers.put(mailTest, ctest);
						System.out.println("Customer Registered..\n");
					break;
					
					
					//View all customer's details
					case 2:
						System.out.println("Details of all Customers:");
//						Iterator<Customer> itr = customers.values().iterator();
//						while(itr.hasNext())
//							System.out.println(itr.next()+"\n");
					//	alternative way
						for(Customer c : customers.values())
							System.out.println(c);
					break;
					
					
					// Customer Login
					case 3:
						System.out.println("Enter Email and Password:");
						validateEmailAndPassword(sc.next(),sc.next(),customers);						
					break;
					
					
					// Change Password
					case 4:
						System.out.println("Enter Email and current Password:");
						Customer c1 = validateEmailAndPassword(sc.next(),sc.next(),customers);
						System.out.println("Enter new Password to be set");
						c1.setPassword(sc.next());
					break;	
					
					
					// Unsubscribe Customer
					case 5:
						System.out.println("To Confirm Unsubscription..\nEnter Email and Password");
						String mailTest1 = sc.next();
						validateEmailAndPassword(mailTest1,sc.next(),customers);
						customers.remove(mailTest1);
						System.out.println("Customer Unsubscribed");
					break;
					
					
					// exit condition
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
