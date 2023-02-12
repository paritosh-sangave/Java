import java.util.*;
class CustomerTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Customer c1=new Customer();
		System.out.println("Enter name:");
		c1.setName(sc.next());
		
		System.out.println("Enter email:");
		c1.setEmail(sc.next());

		System.out.println("Enter Age:");
		c1.setAge(sc.nextInt());

		System.out.println("Enter Credit Limit:");
		c1.setCreditLimit(sc.nextDouble());
		
		c1.getName();
		c1.getEmail();
		c1.getAge();
		c1.getCreditLimit();
	}
}