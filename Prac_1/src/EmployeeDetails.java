import java.util.Scanner;
class EmployeeDetails
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int empId;
        double salary;
        String name;
        boolean permanent;
       
        System.out.println("Enter employee ID:");
        empId = sc.nextInt();
       
        System.out.println("Enter employee name:");
        name = sc.next();
       
        System.out.println("Enter employee salary:");
        salary = sc.nextDouble();
       
        System.out.println("Is the employee permanent: ");
        permanent = sc.nextBoolean();
       
        System.out.println("\n\n");
       
        System.out.println("Employee ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Is permanent?: "+permanent);
       
        sc.close();
    }
}