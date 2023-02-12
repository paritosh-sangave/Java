import java.util.*;
class Arithmetic
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double num1,num2;
		boolean exit = false;
		System.out.println("Enter two numbers: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
	
		while(!exit)
		{
				System.out.print("Enter choice (add,sub,mul,div,quit): ");
				switch(sc.next())
				{
					case "add":
					System.out.println("Sum = "+(num1+num2));
					//if num1+num2 is not put under brackets, the numbers will be printed concatenated
					//since + operator is treated as concatenation operator in println method
					break;
				
					case "sub":
					System.out.println("Subtraction of two numbers = "+(num1-num2));
					break;
				
					case "mul":
					System.out.println("Multiplication of two numbers = "+(num1*num2));
					break;
				
					case "div":
					System.out.println("Division of two numbers = "+(num1/num2));
					break;
				
					case "quit":
					exit = true;
					break;
				
					default:
					System.out.println("Wrong Input.");
				}
			}
			sc.close();
	}
}