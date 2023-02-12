package tester;
import java.util.Scanner;
import java.util.Arrays;
import com.app.core.*;

//import static com.app.core.Category.*;
//import static com.app.core.Vehicle.*;
//import static method for date's 
import static utils.ValidationRules.*;

public class Showroom 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in))
		{
			//init
			System.out.println("Enter max no of vehicles");
			Vehicle[] showroom = new Vehicle[sc.nextInt()];
			boolean exit = false;
			int counter = 0;
			while(!exit)
			{
				System.out.println("Enter Option \n1. Add Vehicle Detail \n2. Show Inventory "
						+ "\n3. Purchase Vehicle \n10. exit");
				try 
				{
					switch (sc.nextInt()) 
					{
					case 1:
						if(counter < showroom.length)
						{
							System.out.println("Valid categories : "+Arrays.toString(Category.values()));
							System.out.println("Enter vehicle details : chasisNo, model, price, "
									+ "manufacturing date(yyyy-mm-dd), category");
							Vehicle newVehicle = new Vehicle(sc.next(), sc.next(), sc.nextDouble(), 
									parseAndValidateDate(sc.next()), Category.valueOf(sc.next().toUpperCase()));
							showroom[counter++] = newVehicle;
							System.out.println("Vehicle added in showroom...\n");
						}
						else
							System.out.println("Showroom Full!!");
						break;
					
					case 2:
						System.out.println("Showroom Inventory : ");
						for(Vehicle v: showroom)
							if(v!=null)
								System.out.println(v);
						break;
						
					case 3:
						System.out.println("Enter chasis no. and date");
						Vehicle v = findByChasisNoAndDate(sc.next(),sc.next(),showroom);
						System.out.println("Found vehicle :"+v);
						checkIfSold(v);
						System.out.println("Enter delivery Address:");
						System.out.println("adrLine1, city, state, country, zipCode");
						System.out.println(v.linkDeliveryAddress(sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));
						break;
					
					case 10:
						exit = true;
						break;
					
					default:
						System.out.println("Invalid Entry");
					}
				}catch (Exception e) 
				{
					e.printStackTrace();
					System.out.println("Invalid input, please retry");
					//read pending off inputs
					sc.nextLine();
				}
			}
		}
	}
}
